package com.src.vtparkingmapper;

import com.src.model.Credential;

import android.app.Application;

public class ApplicationSingleton extends Application {
    
    private Credential pass;
    static public String sharedPrefName = "credentials";

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
