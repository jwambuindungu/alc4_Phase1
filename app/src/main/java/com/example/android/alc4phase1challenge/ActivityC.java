package com.example.android.alc4phase1challenge;

import android.os.Bundle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {
    private CircleImageView mProfileImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //mProfileImage = (CircleImageView) findViewById(R.id.myphoto);
    }

}
