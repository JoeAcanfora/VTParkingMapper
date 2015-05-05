package com.src.vtparkingmapper;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.MapFragment;
import com.src.model.LotsModel;
import com.src.model.ParkingLot;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MapAcitivity extends Activity implements SensorEventListener{

    static final LatLng bburg = new LatLng(37.2300, -80.4178);
    private GoogleMap map;
    private LotsModel lots;
       
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        
        //Move the camera instantly to bburg with a zoom of 15.
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(bburg, 8));
        
        // Zoom in, animating the camera.
        map.animateCamera(CameraUpdateFactory.zoomTo(14), 2000, null); 
        drawLots();
    }
    
    private void drawLots() {
        lots = new LotsModel();
        for (ParkingLot lot : lots.getLots()) {
            PolygonOptions p = new PolygonOptions();
            for (LatLng ll : lot.getPoints()) {
                p.add(ll);
            }
            if (lot.isAvailable((((ApplicationSingleton) getApplication()).getPass()))) {
                p.strokeColor(Color.GREEN);
                p.fillColor(Color.GREEN);
                
                MarkerOptions opts = new MarkerOptions();
                opts.position(lot.getCenter());
                opts.title(lot.getOfficialName());
                opts.snippet(lot.getSlangName());
                map.addMarker(opts);
            } else {
                p.strokeColor(Color.RED);
                p.fillColor(Color.RED);
            }
            map.addPolygon(p); 
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.map_acitivity, menu);
        System.out.println("Something pressed");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.change_credential) {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra("force edit", true);
            startActivity(intent);
            return true;
        }
        if (id == R.id.compare_passes){
            Intent intent = new Intent(this, PassCompareActivity.class);
            startActivity(intent);
            return true;
        }
        System.out.println("Settings pressed");
        return super.onOptionsItemSelected(item);
    }
    
    // ----------shake controls ------------------
    private long lastUpdate = 0;
    private float last_x, last_y, last_z;
    private static final int SHAKE_THRESHOLD = 2000;
    
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor mySensor = sensorEvent.sensor;
        
        if (mySensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];
     
            long curTime = System.currentTimeMillis();
     
            if ((curTime - lastUpdate) > 100) {
                long diffTime = (curTime - lastUpdate);
                lastUpdate = curTime;
     
                float speed = Math.abs(x + y + z - last_x - last_y - last_z)/ diffTime * 10000;
     
                if (speed > SHAKE_THRESHOLD) {
                    System.out.println("SHAKE SHAKE");
                }
     
                last_x = x;
                last_y = y;
                last_z = z;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // TODO Auto-generated method stub
        
    }
}
