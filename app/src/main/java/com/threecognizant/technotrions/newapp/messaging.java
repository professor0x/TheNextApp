package com.threecognizant.technotrions.newapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class messaging extends AppCompatActivity {
    int ids[][]; //row is R.id, column is R.drawable
    ImageButton ibArray[];
    String intentPath[]; //target packages

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ids=new int[4][4];
        ibArray=new ImageButton[4];
        intentPath=new String[4];

        ids[0][0]=R.id.whatsapp;
        ids[0][1]=R.drawable.whatsapp;
        ibArray[0]=(ImageButton)findViewById(ids[0][0]);
        intentPath[0]="com.whatsapp";

        ids[2][0]=R.id.hike;
        ids[2][1]=R.drawable.hike;
        ibArray[2]=(ImageButton)findViewById(ids[2][0]);
        intentPath[2]="com.bsb.hike";

        //ImageButton whatsapp=(ImageButton)findViewById(R.id.whatsapp);
        ibArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;

                boolean changed[]=new boolean[4];
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPath[0]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();

                    Toast.makeText(messaging.this, ibArray[0].getDrawable().toString(), Toast.LENGTH_LONG).show();
                    Toast.makeText(messaging.this, Integer.toString(ids[0][1]), Toast.LENGTH_LONG).show();

//                    if (ibArray[0].getDrawable().toString().equalsIgnoreCase(Integer.toString(ids[0][1]))) {
                    if(!changed[0]){
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);
                        ibArray[0].setImageResource(ids[2][1]);
                        changed[0]=true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Toast.makeText(messaging.this, "App not installed on device", Toast.LENGTH_SHORT).show();

                }
                if (changed[0]) {

                    ImageButton i2 = (ImageButton) findViewById(ids[2][0]);
                    changed[2]=true;
                    i2.setImageResource(ids[0][1]);
                }
            }
        });
    }

}
