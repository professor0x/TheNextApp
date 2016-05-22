package com.threecognizant.technotrions.newapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BeforeTravelling extends AppCompatActivity{

    ImageButton ibArray[];
    String appName[];
    //ImageButton ib2Array[];
    int ids[][]; //row is R.id, column is R.drawable
    String intentPath[]; //target packages
    int target[];
    String temp;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_travelling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//initializations start
        ids = new int[7][2];
        intentPath = new String[7];
        target = new int[7];
        appName = new String[7];
        ibArray = new ImageButton[7];

        ids[0][0] = R.id.ola;
        ids[0][1] = R.drawable.ola;
        ibArray[0] = (ImageButton) findViewById(R.id.ola);
        temp = ibArray[0].toString();
        appName[0] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        intentPath[0] = "com.olacabs.customer";
        target[0] = 0;

        ids[1][0] = R.id.makemytrip;
        ids[1][1] = R.drawable.makemytrip;
        ibArray[1] = (ImageButton) findViewById(R.id.makemytrip);
        temp = ibArray[1].toString();
        appName[1] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        intentPath[1] = "com.makemytrip";
        target[1] = 1;

        ids[2][0] = R.id.oyo;
        ids[2][1] = R.drawable.oyo;
        ibArray[2] = (ImageButton) findViewById(R.id.oyo);
        temp = ibArray[2].toString();
        appName[2] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        intentPath[2] = "com.oyo.consumer";
        target[2] = 2;

        ids[3][0] = R.id.packpoint;
        ids[3][1] = R.drawable.packpoint;
        ibArray[3] = (ImageButton) findViewById(R.id.packpoint);
        temp = ibArray[3].toString();
        appName[3] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        intentPath[3] = "com.YRH.PackPoint";
        target[3] = 3;

        ids[4][0] = R.id.tripadvisor;
        ids[4][1] = R.drawable.tripadvisor;
        ibArray[4] = (ImageButton) findViewById(R.id.tripadvisor);
        temp = ibArray[4].toString();
        appName[4] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        intentPath[4] = "com.tripadvisor.tripadvisor";
        target[4] = 4;

        ids[5][0] = R.id.flipkart;
        ids[5][1] = R.drawable.flipkart;
        intentPath[5] = "com.flipkart.android";
        target[5] = 5;
        ibArray[5] = (ImageButton) findViewById(R.id.flipkart);
        temp = ibArray[5].toString();
        appName[5] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

        ids[6][0] = R.id.mysmartprice;
        ids[6][1] = R.drawable.mysmartprice;
        intentPath[6] = "com.MySmartPrice.MySmartPrice";
        ibArray[6] = (ImageButton) findViewById(R.id.packpoint);
        temp = ibArray[6].toString();
        appName[6] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        target[6] = 6;

//initializations end

        temp = ibArray[target[0]].toString();
        temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        //Toast.makeText(BeforeTravelling.this, temp, Toast.LENGTH_SHORT).show();
        if (temp.equalsIgnoreCase(appName[0])) {
            //Toast.makeText(BeforeTravelling.this, "OLA matches", Toast.LENGTH_SHORT).show();
            ibArray[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i;
                    PackageManager manager = getPackageManager();
                    try {
                        i = manager.getLaunchIntentForPackage(intentPath[target[0]]);
                        if (i == null)
                            throw new PackageManager.NameNotFoundException();
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);
                    } catch (PackageManager.NameNotFoundException e) {
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("market://details?id=" + intentPath[target[0]]));
                        startActivity(i);
                    }
                   /* finally {
                        target[0]=target[1];
                    }*/
                }
            });
        }
        temp = ibArray[target[1]].toString();
        temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        if (temp.equalsIgnoreCase(appName[1])) {
            //Toast.makeText(BeforeTravelling.this, "OLA matches", Toast.LENGTH_SHORT).show();
            ibArray[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i;
                    PackageManager manager = getPackageManager();
                    try {
                        i = manager.getLaunchIntentForPackage(intentPath[target[1]]);
                        if (i == null)
                            throw new PackageManager.NameNotFoundException();
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);
                    } catch (PackageManager.NameNotFoundException e) {
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("market://details?id=" + intentPath[target[1]]));
                        startActivity(i);
                    }
                   /* finally {
                        target[0]=target[1];
                    }*/
                }
            });
        }
        temp = ibArray[target[2]].toString();
        temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        if (temp.equalsIgnoreCase(appName[2])) {
            //Toast.makeText(BeforeTravelling.this, "OLA matches", Toast.LENGTH_SHORT).show();
            ibArray[2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i;
                    PackageManager manager = getPackageManager();
                    try {
                        i = manager.getLaunchIntentForPackage(intentPath[target[2]]);
                        if (i == null)
                            throw new PackageManager.NameNotFoundException();
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);
                    } catch (PackageManager.NameNotFoundException e) {
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("market://details?id=" + intentPath[target[2]]));
                        startActivity(i);
                    }
                   /* finally {
                        target[0]=target[1];
                    }*/
                }
            });
        }
        temp = ibArray[target[3]].toString();
        temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
        if (temp.equalsIgnoreCase(appName[3])) {
            //Toast.makeText(BeforeTravelling.this, "OLA matches", Toast.LENGTH_SHORT).show();
            ibArray[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i;
                    PackageManager manager = getPackageManager();
                    try {
                        i = manager.getLaunchIntentForPackage(intentPath[target[3]]);
                        if (i == null)
                            throw new PackageManager.NameNotFoundException();
                        i.addCategory(Intent.CATEGORY_LAUNCHER);
                        startActivity(i);
                    } catch (PackageManager.NameNotFoundException e) {
                        i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("market://details?id=" + intentPath[target[3]]));
                        startActivity(i);
                    }
                   /* finally {
                        target[0]=target[1];
                    }*/
                }
            });
        }
        final Button updateButton = (Button) findViewById(R.id.updateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = ibArray[target[0]].toString();
                temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
                Toast.makeText(BeforeTravelling.this, temp, Toast.LENGTH_SHORT).show();
                //new, new, new, zombie
                if (appName[0].equalsIgnoreCase(temp)) {
                    Toast.makeText(BeforeTravelling.this, "ola,makemytrip", Toast.LENGTH_SHORT).show();
                    int temp = 0;
                    //new
                    target[0] = target[1];
                    ibArray[0].setImageResource(ids[1][1]);
                    //new
                    target[1] = target[2];
                    ibArray[1].setImageResource(ids[2][1]);
                    //new
                    target[2] = target[3];
                    ibArray[2].setImageResource(ids[3][1]);
                    //zombie
                    target[3] = temp;
                    ibArray[3].setImageResource(ids[temp][1]);
                }
                //next, new, new, zombie
                else if (appName[1].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
                    Toast.makeText(BeforeTravelling.this, "makemytrip,oyo", Toast.LENGTH_SHORT).show();
                    int temp = 0;
                    /*//new
                    target[2] = target[1];
                    ibArray[2].setImageResource(ids[1][1]);
                    //new
                    target[1] = target[3];
                    ibArray[1].setImageResource(ids[3][1]);
                    //zombie
                    target[3] = target[0];
                    ibArray[3].setImageResource(ids[0][1]);
                    //next
                    target[0] = target[2];
                    ibArray[0].setImageResource(ids[2][1]);*/

                    //next
                    target[0] = target[2];
                    ibArray[0].setImageResource(ids[2][1]);
                    //new
                    target[2] = target[1];
                    ibArray[2].setImageResource(ids[1][1]);
                    //new
                    target[1] = target[3];
                    ibArray[1].setImageResource(ids[3][1]);
                    //zombie
                    target[3] = temp;
                    ibArray[3].setImageResource(ids[temp][1]);

                }
                //next, new, zombie, popular
                else if (appName[2].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
                    Toast.makeText(BeforeTravelling.this, "oyo,packpoint", Toast.LENGTH_SHORT).show();
                    int temp = 0;
                    //next
                    target[0] = target[3];
                    ibArray[0].setImageResource(ids[3][1]);
                    //zombie unchanged
                    target[2] = target[2];
                    ibArray[2].setImageResource(ids[2][1]);
                    //new
                    target[1] = target[4];
                    ibArray[1].setImageResource(ids[4][1]);
                    //popular
                    target[3] = temp;
                    ibArray[3].setImageResource(ids[temp][1]);

                }
                //next, new, zombie, popular
                else if (appName[3].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
                    Toast.makeText(BeforeTravelling.this, "packpoint,tripadvisor", Toast.LENGTH_SHORT).show();
                    int temp = 0;
                    //zombie
                    target[2] = target[3];
                    ibArray[2].setImageResource(ids[3][1]);
                    //next
                    target[0] = target[4];
                    ibArray[0].setImageResource(ids[4][1]);
                    //new
                    target[1] = target[5];
                    ibArray[1].setImageResource(ids[5][1]);
                    //popular
                    target[3] = temp;
                    ibArray[3].setImageResource(ids[temp][1]);

                }
                //next, new, zombie, popular
                else if (appName[4].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
                    Toast.makeText(BeforeTravelling.this, "tripadvisor,flipkart", Toast.LENGTH_SHORT).show();
                    int temp = 0;
                    //zombie
                    target[2] = target[4];
                    ibArray[2].setImageResource(ids[4][1]);
                    //next
                    target[0] = target[5];
                    ibArray[0].setImageResource(ids[5][1]);
                    //new
                    target[1] = target[6];
                    ibArray[1].setImageResource(ids[6][1]);
                    //popular
                    target[3] = temp;
                    ibArray[3].setImageResource(ids[temp][1]);

                }
                //next, zombie, popular, popular2
                else if (appName[5].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
                    Toast.makeText(BeforeTravelling.this, "flipkart,mysmartprice", Toast.LENGTH_SHORT).show();
                    int temp = 0;
                    //zombie
                    target[2] = target[4];
                    ibArray[2].setImageResource(ids[4][1]);
                    //next
                    target[0] = target[6];
                    ibArray[0].setImageResource(ids[6][1]);
                    //new
                    target[1] = target[5];
                    ibArray[1].setImageResource(ids[5][1]);
                    //popular
                    target[3] = temp;
                    ibArray[3].setImageResource(ids[temp][1]);


                }
            }
        });

    }

}
