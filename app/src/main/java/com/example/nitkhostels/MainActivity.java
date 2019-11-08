package com.example.nitkhostels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();


        long delay = 2000;
        timer.schedule(new TimerTask(){
         @Override
         public void run(){
             Intent intent = new Intent(MainActivity.this,Login.class);
             startActivity(intent);
             finish();
         }
        }, delay);
    }


}
