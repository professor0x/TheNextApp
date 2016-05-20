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
    ImageButton ibArray[], ib2Array[];
    String intentPath[]; //target packages
    int target[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        target = new int[1];
        target[0] = 0;
        ids = new int[4][4];
        ibArray = new ImageButton[4];
        ib2Array = ibArray; //backup, since ibArray will continuously change
        intentPath = new String[4];

        ids[0][0] = R.id.whatsapp;
        ids[0][1] = R.drawable.whatsapp;
        ibArray[0] = (ImageButton) findViewById(ids[0][0]);
        intentPath[0] = "com.whatsapp";

        ids[2][0] = R.id.hike;
        ids[2][1] = R.drawable.hike;
        ibArray[2] = (ImageButton) findViewById(ids[2][0]);
        intentPath[2] = "com.bsb.hike";

        //ImageButton whatsapp=(ImageButton)findViewById(R.id.whatsapp);
        ibArray[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//  while(BACK BUTTON IS NOT PRESSED){//everything inside this block
                Intent i;
//                int target=0;
                int current = 0;
                boolean changed[] = new boolean[4];


                String mew = ibArray[0].toString();
                String currApp = mew.substring(mew.lastIndexOf('/') + 1, mew.length() - 1);
                Toast.makeText(messaging.this, currApp, Toast.LENGTH_LONG).show();

                if (currApp.equalsIgnoreCase("whatsapp")) {
                    try {
                        PackageManager manager = getPackageManager();
                        i = manager.getLaunchIntentForPackage(intentPath[target[0]]);
                        if (i == null)
                            throw new PackageManager.NameNotFoundException();
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);

                    } catch (PackageManager.NameNotFoundException e) {
                        Toast.makeText(messaging.this, "App not installed on device", Toast.LENGTH_SHORT).show();

                    } finally {
                        target[0] = 2;
                        ids[current][0] = ids[target[0]][0];
                        ids[current][1] = ids[target[0]][1];
                    }
                }
                if (currApp.equalsIgnoreCase("hike")) {
                    try {
                        PackageManager manager = getPackageManager();
                        i = manager.getLaunchIntentForPackage(intentPath[target[0]]);
                        if (i == null)
                            throw new PackageManager.NameNotFoundException();
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);

                    } catch (PackageManager.NameNotFoundException e) {
                        Toast.makeText(messaging.this, "App not installed on device", Toast.LENGTH_SHORT).show();

                    } finally {
                        target[0] = 0;
                        ids[current][0] = ids[target[0]][0];
                        ids[current][1] = ids[target[0]][1];
                    }
                }
                ibArray[current].setImageResource(ids[target[0]][1]);
            }
            }
        );
    }

}
