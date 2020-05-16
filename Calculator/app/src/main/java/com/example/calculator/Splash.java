package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread td=new Thread() {

            public void run() {
                try {
                    sleep(1000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent it = new Intent(Splash.this, Calculator2.class);
                    startActivity(it);
                }
            }
        };td.start();

    }
}
