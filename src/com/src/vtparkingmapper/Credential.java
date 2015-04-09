package com.src.vtparkingmapper;

import java.util.Date;

public class Credential {
    
    private Date start;
    private Date end;
    private enum Pass {
        RESIDENT,
        COMMUTER,
        GRADUATE,
        FACILITYSTAFF,
        BBW,
        VISITOR,
        CARPOOLCG,
        CARPOOLFS
    };
    private Pass cred;
    
    public Credential(Date s, Date e, String pass){
        
        start = s;
        end = e;
        switch (pass) {
            case "Resident":
                cred = Pass.RESIDENT;
                break;
            case "Commuter":
                cred = Pass.COMMUTER;
                break;
            case "Graduate":
                cred = Pass.GRADUATE;
                break;
            case "Facility/Staff":
                cred = Pass.FACILITYSTAFF;
                break;
            case "Bike Bus and Walk":
                cred = Pass.BBW;
                break;
            case "Visitor":
                cred = Pass.VISITOR;
                break;
            case "Carpool C/G":
                cred = Pass.CARPOOLCG;
                break;
            case "Carpool F/S":
                cred = Pass.CARPOOLFS;
                break;
            default:
                System.err.println("Credential string coming in whack: " + pass);
        }
    }

    /**
     * @return the start
     */
    public Date getStart() {
        return start;
    }

    /**
     * @return the end
     */
    public Date getEnd() {
        return end;
    }

    /**
     * @return the cred
     */
    public Pass getCred() {
        return cred;
    }
}
