package com.patelheggere.locationrecorder.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.patelheggere.locationrecorder.R;
import com.patelheggere.locationrecorder.services.LocationService;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button mLocationStartButton, mLocationStopButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        initListeners();
    }

    private void initViews() {
        mLocationStartButton = findViewById(R.id.startButton);
        mLocationStopButton = findViewById(R.id.stopButton);
    }

    private void initData(){

    }
    private void initListeners() {
        mLocationStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, LocationService.class));
            }
        });

        mLocationStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, LocationService.class));
            }
        });
    }

}
