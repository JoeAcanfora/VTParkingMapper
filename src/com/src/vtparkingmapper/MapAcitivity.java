package com.src.vtparkingmapper;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.MapFragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MapAcitivity extends Activity {

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
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
