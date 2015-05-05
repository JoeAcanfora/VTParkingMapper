package com.src.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import com.google.android.gms.maps.model.LatLng;

public class ParkingLot {

    private List<LatLng> points;
    private String officialName;
    private String slangName;
    private List<Credential.Pass> cred;
    private int startHour24;
    private int endHour24;

    public ParkingLot(List<LatLng> pts, Credential.Pass cred, int sTime, int eTime, String offName,
            String slang) {

        startHour24 = sTime;
        endHour24 = eTime;
        this.cred = new ArrayList<Credential.Pass>();
        this.cred.add(cred);
        points = pts;
        officialName = offName;
        slangName = slang;
    }
    
    public String getOfficialName() {
        return officialName;
    }
    
    public String getSlangName() {
        
        return slangName;
    }
    
    public ParkingLot(List<LatLng> pts, ArrayList<Credential.Pass> cred, int sTime, int eTime) {

        startHour24 = sTime;
        endHour24 = eTime;
        this.cred = cred;
        points = pts;
    }
    
    public void addCredential(Credential.Pass cred) {
        this.cred.add(cred);
    }

    /**
     * 
     * @param p
     * @return
     */
    public boolean isAvailable(Credential p) {
        Calendar c = Calendar.getInstance(TimeZone.getDefault());
        int currHour = c.get(Calendar.HOUR_OF_DAY);
        int day = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("current hour:" + currHour);
        for (Credential.Pass thisCred : cred) {
            if (p.getCred() == thisCred || (currHour < startHour24 || currHour > endHour24 ) 
                    || day == Calendar.SATURDAY || day == Calendar.SUNDAY) {
                return true;
            }
        }
        return false;
    }

    public List<LatLng> getPoints() {
        return points;
    }
    
    public LatLng getCenter() {
        
        double min_lat = points.get(0).latitude;
        double min_long = points.get(0).longitude;
        double max_lat = min_lat;
        double max_long = min_long;
        for (LatLng ll : points){
            if (ll.latitude < min_lat) {
                min_lat = ll.latitude;
            }
            if (ll.latitude > max_lat) {
                max_lat = ll.latitude;
            }
            if (ll.longitude < min_long) {
                min_long = ll.longitude;
            }
            if (ll.longitude > max_long) {
                max_long = ll.longitude;
            }
        }
        double f_lat = min_lat + (max_lat - min_lat)/2;
        double f_long = min_long + (max_long - min_long)/2;
        
        return new LatLng(f_lat, f_long);
    }
}
