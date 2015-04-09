package com.src.vtparkingmapper;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
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
        
        Polygon westCampusDrive = map.addPolygon(new PolygonOptions()
        .add(new LatLng(37.231396, -80.428725), new LatLng(37.23170370212619, -80.42803555727005), 
                new LatLng(37.23084947245539, -80.42696535587311),
                new LatLng(37.229918351090596, -80.42818039655685))
        .strokeColor(Color.GREEN)
        .fillColor(Color.GREEN));
        
        Polygon behindGarage = map.addPolygon(new PolygonOptions()
        .add(new LatLng(37.23172078662087, -80.42770564556122), 
                new LatLng(37.23137482484868, -80.42722016572952), 
                new LatLng(37.231955698030454, -80.42643561959267),
                new LatLng(37.2323315547634, -80.42678765952587))
        .strokeColor(Color.GREEN)
        .fillColor(Color.GREEN));
        
        Polygon goodwinHallLot = map.addPolygon(new PolygonOptions()
        .add(new LatLng(37.231635364108676, -80.4257744550705), 
                new LatLng(37.23116553856154, -80.42518705129623), 
                new LatLng(37.23228243722858, -80.42386338114738),
                new LatLng(37.232555786581045, -80.42442128062248))
        .strokeColor(Color.GREEN)
        .fillColor(Color.GREEN));
        
        Polygon SurgeLot = map.addPolygon(new PolygonOptions()
        .add(new LatLng(37.232557922118964, -80.42395859956741), 
                new LatLng(37.23225253958304, -80.42305067181587), 
                new LatLng(37.23258141303202, -80.42261347174644),
                new LatLng(37.23298396072317, -80.42378090322018))
        .strokeColor(Color.GREEN)
        .fillColor(Color.GREEN));
        
        Polygon HahnLot = map.addPolygon(new PolygonOptions()
        .add(new LatLng(37.227791250892956, -80.42647317051888), 
                new LatLng(37.227156953376785, -80.4259816557169), 
                new LatLng(37.22512801977121, -80.424380376935),
                new LatLng(37.22577568266661, -80.42465765029192))
        .strokeColor(Color.GREEN)
        .fillColor(Color.GREEN));
        
        Polygon SlusherLot = map.addPolygon(new PolygonOptions()
        .add(new LatLng(37.22558079705477, -80.42303994297981), 
                new LatLng(37.22511413740591, -80.42302586138248), 
                new LatLng(37.224821539265314, -80.42282737791538),
                new LatLng(
                        37.225204372734815,
                        -80.42261850088835),
                new LatLng(
                        37.22558506852563,
                        -80.42263258248568))
        .strokeColor(Color.GREEN)
        .fillColor(Color.GREEN));
        
        
        
        
        
        
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
