package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread td=new Thread(){

            public void run()
            {
                try{
                    sleep(3000);
                }catch(Exception ex)
                {
               ex.printStackTrace();
                }finally
                {
                    Intent it=new Intent(splash.this,Calculator.class);
                    startActivity(it);
                }
            }
        };td.start();
    }
}
