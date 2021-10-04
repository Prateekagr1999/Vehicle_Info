package com.example.vehicleinfonoads;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button getInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getInfo = (Button) findViewById(R.id.fetch);
        getInfo.setOnClickListener(view -> {
            Intent intent = new Intent(Home.this, infoPage.class);
            startActivity(intent);
        });
    }
}