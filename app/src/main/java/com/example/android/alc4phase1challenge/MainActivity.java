package com.example.android.alc4phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnALC;
    private Button btnProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mytoolBar = (Toolbar) findViewById(R.id.toolbar);
        //mytoolBar.setLogoDescription(getResources().getString(R.string.my_main_toolbar));
        btnALC = (Button) findViewById(R.id.alc_button);
        btnProfile = (Button) findViewById(R.id.profile_button);
        btnALC.setOnClickListener(this);
        btnProfile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.alc_button:
                ActivityALC();
                break;

            case R.id.profile_button:
                ActivityProfile();
                break;
        }


    }

    private void ActivityProfile() {
        Intent intentB = new Intent(this,ActivityC.class);
        startActivity(intentB);

    }

    private void ActivityALC() {
        Intent intentC = new Intent(this,ActivityB.class);
        startActivity(intentC);

    }
}

