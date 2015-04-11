package com.src.vtparkingmapper;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import com.google.android.gms.maps.model.LatLng;

public class ParkingLot {
    
    private List<LatLng> points;
    
    private Credential.Pass cred;
    private int startHour24;
    private int endHour24;
    
    public ParkingLot(List<LatLng> pts, Credential.Pass cred, int sTime, int eTime) {
        
        startHour24 = sTime;
        endHour24 = eTime;
        this.cred = cred;
        points = pts;
    }
    
    /**
     * 
     * @param p
     * @return
     */
    public boolean isAvailable(Credential p) {
        Calendar c = Calendar.getInstance(TimeZone.getDefault());
        int currHour = c.get(Calendar.HOUR_OF_DAY);
        System.out.println("current hour:" + currHour);
        if (p.getCred() == cred || (currHour < startHour24 || currHour > endHour24 )) {
            return true;
        }
        return false;
    }
    
    public List<LatLng> getPoints() {
        return points;
    }
}
