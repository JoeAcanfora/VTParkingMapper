package com.src.vtparkingmapper;

import android.app.Application;

public class ApplicationSingleton extends Application {
    
    private Credential pass;

    /**
     * @return the pass
     */
    public Credential getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(Credential pass) {
        this.pass = pass;
    }
    
}
