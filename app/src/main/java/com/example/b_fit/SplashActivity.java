package com.example.b_fit;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.security.Permission;

public class SplashActivity extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    private final static int PERMISSIONS_CODE = 100;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);
        permission.checkAndRequestPermissions(this,this);
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start app main activity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults) {

        int count=0;
        if(requestCode == PERMISSIONS_CODE){
            for(int i=0;i< grantResults.length;i++){
                if(grantResults.length >0&& grantResults[i] == PackageManager.PERMISSION_GRANTED){

                }
                else
                {
                    count++;

                }
            }

        }
        if(count==0) {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }
                    else{
                        Toast.makeText(SplashActivity.this,"PLEASE PERMIT",Toast.LENGTH_SHORT).show();
        }

    }
}