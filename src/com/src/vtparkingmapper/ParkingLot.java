package com.src.vtparkingmapper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import com.google.android.gms.maps.model.LatLng;

public class ParkingLot {

    private List<LatLng> points;

    private List<Credential.Pass> cred;
    private int startHour24;
    private int endHour24;

    public ParkingLot(List<LatLng> pts, Credential.Pass cred, int sTime, int eTime) {

        startHour24 = sTime;
        endHour24 = eTime;
        this.cred = new ArrayList<Credential.Pass>();
        this.cred.add(cred);
        points = pts;
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
}
