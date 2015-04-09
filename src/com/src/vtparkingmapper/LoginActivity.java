package com.src.vtparkingmapper;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class LoginActivity extends Activity {
    
    private EditText startDate;
    private EditText endDate;
    private Spinner credential;
    private Button submit;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        startDate = (EditText) findViewById(R.id.startDate);
        endDate = (EditText) findViewById(R.id.endDate);
        credential = (Spinner) findViewById(R.id.pass);
        
        startDate.setText("08/26/2014");
        endDate.setText("08/26/2015");
        
        String list[] = {"Resident", "Commuter", "Graduate", "Facility/Staff", "Bike Bus and Walk", "Visitor",
                "Carpool C/G", "Carpool F/S"};
        ArrayAdapter<String> passAdapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        
        credential.setAdapter(passAdapt);
        
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                setCredentials();   
            }          
        });
    }
    
    /**
     * Sets the credential variable in the ApplicationSingleton Class.
     */
    private void setCredentials() {
        if (startDate.getText().toString() == "" 
                || endDate.getText().toString() == "" 
                || credential.getSelectedItem().toString() == "") {
            Toast toasty = new Toast(this);
            toasty.setText("Please fill in all the forms");
            toasty.show();
            return;
        }
        Date s = new Date(startDate.getText().toString());
        Date e = new Date(endDate.getText().toString());
        String p = credential.getSelectedItem().toString();
        
        Credential pass = new Credential(s, e, p);
        ((ApplicationSingleton)(this.getApplication())).setPass(pass);
        Intent toMap = new Intent(this, MapAcitivity.class);
        startActivity(toMap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
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
