package com.threecognizant.technotrions.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BeforeTravelling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_travelling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button CL = (Button) findViewById(R.id.CL);
        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, CheckList.class));
            }
        });

        Button OS = (Button) findViewById(R.id.OS);
        OS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, OnlineShopping.class));
            }
        });

        Button PC = (Button) findViewById(R.id.PC);
        PC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, Comparator.class));
            }
        });

        Button CP = (Button) findViewById(R.id.CP);
        CP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, TravelGuide.class));
            }
        });

        Button Tkt = (Button) findViewById(R.id.Tkt);
        Tkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, Ticketing.class));
            }
        });

        Button Hot = (Button) findViewById(R.id.Hot);
        Hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, Hotel.class));
            }
        });

        Button LT = (Button) findViewById(R.id.LT);
        LT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, LocalTravel.class));
            }
        });

        Button wthr = (Button) findViewById(R.id.wthr);
        wthr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BeforeTravelling.this, Weather.class));
            }
        });
    }

}
