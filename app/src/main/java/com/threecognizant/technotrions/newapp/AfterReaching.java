package com.threecognizant.technotrions.newapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AfterReaching extends AppCompatActivity {


    ImageButton ibArray[];
    ImageButton ibArrayRow2[];

    int ids[][]; //row is R.id, column is R.drawable
    int target[];
    String intentPath[]; //target packages
    String appName[];

    int idsRow2Col1[][]; //row is R.id, column is R.drawable
    String intentPathRow2Col1[]; //target packages
    String appNameRow2Col1[];

    int idsRow2Col2[][]; //row is R.id, column is R.drawable
    String intentPathRow2Col2[]; //target packages
    String appNameRow2Col2[];

    String temp, temp2, temp3;
    String var1, var2, var3;
    String reco1, reco2, reco3, reco4, reco5, reco6;

    int zombie[];
    int count[];
    int recos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_reaching);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

//declarations start
        {
            ids = new int[7][2];
            target = new int[7];
            intentPath = new String[7];
            ibArray = new ImageButton[7];
            appName = new String[7];
        }
        {
            ibArrayRow2 = new ImageButton[7];
            count = new int[7];
        }
        {
            idsRow2Col1 = new int[7][2];
            intentPathRow2Col1 = new String[7];
            appNameRow2Col1 = new String[7];
        }
        {
            idsRow2Col2 = new int[7][2];
            intentPathRow2Col2 = new String[7];
            appNameRow2Col2 = new String[7];
        }
        {
            recos = new int[1];
            zombie = new int[1];
        }
//declarations start
//initializations start
        {
            ids[0][0] = R.id.new1;
            ids[0][1] = R.drawable.ola;
            target[0] = 0;
            intentPath[0] = "com.olacabs.customer";
            ibArray[0] = (ImageButton) findViewById(R.id.new1);
            temp = ibArray[0].toString();
            appName[0] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[1][0] = R.id.next1;
            ids[1][1] = R.drawable.makemytrip;
            target[1] = 1;
            intentPath[1] = "com.makemytrip";
            ibArray[1] = (ImageButton) findViewById(R.id.next1);
            temp = ibArray[1].toString();
            appName[1] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[2][0] = R.id.next2;
            ids[2][1] = R.drawable.oyo;
            target[2] = 2;
            intentPath[2] = "com.oyo.consumer";
            ibArray[2] = (ImageButton) findViewById(R.id.next2);
            temp = ibArray[2].toString();
            appName[2] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[3][0] = R.id.next3;
            ids[3][1] = R.drawable.packpoint;
            target[3] = 3;
            intentPath[3] = "com.YRH.PackPoint";
            ibArray[3] = (ImageButton) findViewById(R.id.next3);
            temp = ibArray[3].toString();
            appName[3] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[4][0] = R.id.next4;
            ids[4][1] = R.drawable.tripadvisor;
            target[4] = 4;
            intentPath[4] = "com.tripadvisor.tripadvisor";
            ibArray[4] = (ImageButton) findViewById(R.id.next4);
            temp = ibArray[4].toString();
            appName[4] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
//            appName[4] = "tripadvisor";

            ids[5][0] = R.id.next5;
            ids[5][1] = R.drawable.flipkart;
            target[5] = 5;
            intentPath[5] = "com.flipkart.android";
            ibArray[5] = (ImageButton) findViewById(R.id.next5);
            temp = ibArray[5].toString();
            appName[5] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
//            appName[5] = "flipkart";

            ids[6][0] = R.id.mysmartprice;
            ids[6][1] = R.drawable.mysmartprice;
            target[6] = 6;
            intentPath[6] = "com.MySmartPrice.MySmartPrice";
            ibArray[6] = (ImageButton) findViewById(R.id.next6);
            temp = ibArray[6].toString();
            appName[6] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
//            appName[6] = "mysmartprice";
        }
        {
            idsRow2Col1[0][0] = R.id.uber;
            idsRow2Col1[0][1] = R.drawable.uber;
            intentPathRow2Col1[0] = "com.ubercab";
            appNameRow2Col1[0] = "uber";

            idsRow2Col2[0][0] = R.id.redbus;
            idsRow2Col2[0][1] = R.drawable.redbus;
            intentPathRow2Col2[0] = "in.redbus.android";
            appNameRow2Col2[0] = "redbus";
        }
        {
            idsRow2Col1[1][0] = R.id.cleartrip;
            idsRow2Col1[1][1] = R.drawable.cleartrip;
            intentPathRow2Col1[1] = "com.cleartrip.android";
            appNameRow2Col1[1] = "cleartrip";

            idsRow2Col2[1][0] = R.id.irctc;
            idsRow2Col2[1][1] = R.drawable.irctc;
            intentPathRow2Col2[1] = "com.irctc.main";
            appNameRow2Col2[1] = "irctc";
        }
        {
            idsRow2Col1[2][0] = R.id.touristeye;
            idsRow2Col1[2][1] = R.drawable.touristeye;
            intentPathRow2Col1[2] = "com.touristeye";
            appNameRow2Col1[2] = "touristeye";

            idsRow2Col2[2][0] = 0x7f02009f;
            idsRow2Col2[2][1] = R.drawable.stayzilla;
            intentPathRow2Col2[2] = "com.stayzilla.booking";
            appNameRow2Col2[2] = "stayzilla";
        }
        {
            idsRow2Col1[3][0] = R.id.anydo;
            idsRow2Col1[3][1] = R.drawable.anydo;
            intentPathRow2Col1[3] = "com.anydo";
            appNameRow2Col1[3] = "anydo";

            idsRow2Col2[3][0] = R.id.Todoist;
            idsRow2Col2[3][1] = R.drawable.todoist;
            intentPathRow2Col2[3] = "com.todoist";
            appNameRow2Col2[3] = "todoist";
        }
        {
            idsRow2Col1[4][0] = R.id.goibibo;
            idsRow2Col1[4][1] = R.drawable.goibibo;
            intentPathRow2Col1[4] = "com.goibibo";
            appNameRow2Col1[4] = "goibibo";

            idsRow2Col2[4][0] = R.id.trivago;
            idsRow2Col2[4][1] = R.drawable.trivago;
            intentPathRow2Col2[4] = "com.trivago";
            appNameRow2Col2[4] = "trivago";
        }
        {
            idsRow2Col1[5][0] = R.id.snapdeal;
            idsRow2Col1[5][1] = R.drawable.snapdeal;
            intentPathRow2Col1[5] = "com.snapdeal.main";
            appNameRow2Col1[5] = "snapdeal";

            idsRow2Col2[5][0] = R.id.amazon;
            idsRow2Col2[5][1] = R.drawable.amazon;
            intentPathRow2Col2[5] = "in.amazon.mShop.android.shopping";
            appNameRow2Col2[5] = "amazon";
        }
        {
            idsRow2Col1[6][0] = R.id.myntra;
            idsRow2Col1[6][1] = R.drawable.myntra;
            intentPathRow2Col1[6] = "com.shopclues";
            appNameRow2Col1[6] = "shopclues";

            idsRow2Col2[6][0] = R.id.snapdeal;
            idsRow2Col2[6][1] = R.drawable.snapdeal;
            intentPathRow2Col2[6] = "in.coupondunia.androidapp";
            appNameRow2Col2[6] = "coupondunia";
        }

        final int NEW1 = 1;
        final int NEW2 = 2;
        final int NEW3 = 3;

        ibArrayRow2[0] = (ImageButton) findViewById(R.id.new2);
        ibArrayRow2[1] = (ImageButton) findViewById(R.id.new3);
        ibArrayRow2[2] = (ImageButton) findViewById(R.id.zombie);
        ibArrayRow2[2].setVisibility(View.INVISIBLE);
//initializations end

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
                zombie[0] = NEW1;
            }
        });
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
            }
        });
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
            }
        });
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
            }
        });
        /*}*/

        temp = ibArray[target[0]].toString();
        temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
/*
        Toast.makeText(BeforeTravelling.this, "********" + temp + "********", Toast.LENGTH_SHORT).show();
        Toast.makeText(BeforeTravelling.this, ".......................", Toast.LENGTH_SHORT).show();
        Toast.makeText(BeforeTravelling.this, "********" + appName[0] + "********", Toast.LENGTH_SHORT).show();
*/
        if (temp.equalsIgnoreCase("new1"))
            recos[0] = 0;
        else if (temp.equalsIgnoreCase("next1"))
            recos[0] = 1;
        else if (temp.equalsIgnoreCase("next2"))
            recos[0] = 2;
        else if (temp.equalsIgnoreCase("next3"))
            recos[0] = 3;
        else if (temp.equalsIgnoreCase("next4"))
            recos[0] = 4;
        else if (temp.equalsIgnoreCase("next5"))
            recos[0] = 5;
        else if (temp.equalsIgnoreCase("next6"))
            recos[0] = 6;


        ibArrayRow2[0].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow2Col1[target[0]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow2Col1[target[0]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
                zombie[0] = NEW2;
            }
        });

        ibArrayRow2[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col2[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow2Col2[target[0]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow2Col2[target[0]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
                zombie[0] = NEW3;
            }
        });
        ibArrayRow2[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col2[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i = new Intent();
                PackageManager manager = getPackageManager();
                try {
                    switch (zombie[0]) {
                        case NEW1:
                            i = manager.getLaunchIntentForPackage(intentPath[target[0] - 1]);
                            break;
                        case NEW2:
                            i = manager.getLaunchIntentForPackage(intentPathRow2Col1[target[0] - 1]);
                            break;
                        case NEW3:
                            i = manager.getLaunchIntentForPackage(intentPathRow2Col2[target[0] - 1]);
                            break;
                    }
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    switch (zombie[0]) {
                        case NEW1:
                            i.setData(Uri.parse("market://details?id=" + intentPath[target[0] - 1]));
                            break;
                        case NEW2:
                            i.setData(Uri.parse("market://details?id=" + intentPathRow2Col1[target[0] - 1]));
                            break;
                        case NEW3:
                            i.setData(Uri.parse("market://details?id=" + intentPathRow2Col2[target[0] - 1]));
                            break;
                    }
                    startActivity(i);
                }
            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ibArrayRow2[2].setVisibility(View.VISIBLE);

                temp = ibArray[target[0]].toString();
                temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
                if (appName[0].equalsIgnoreCase(temp)) {

//                    Toast.makeText(BeforeTravelling.this, "{ola,uber,redbus} >> {makemytrip,cleartrip,irctc}", Toast.LENGTH_SHORT).show();
                    int i = 0, j = 1;
                    ibArrayRow2[0].setImageResource(idsRow2Col1[j][1]);
                    ibArrayRow2[1].setImageResource(idsRow2Col2[j][1]);
                    ibArrayRow2[2].setImageResource(ids[j - 1][1]);
                    if (zombie[0] == NEW2)
                        ibArrayRow2[2].setImageResource(idsRow2Col1[j - 1][1]);
                    if (zombie[0] == NEW3)
                        ibArrayRow2[2].setImageResource(idsRow2Col2[j - 1][1]);

                    for (; i < 4 && j < 7; i++, j++) {
                        target[i] = target[j];
                        ibArray[i].setImageResource(ids[j][1]);
                    }

                } else if (appName[1].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
//                    Toast.makeText(BeforeTravelling.this, "makemytrip,oyo", Toast.LENGTH_SHORT).show();
                    int i = 0, j = 2;
                    ibArrayRow2[0].setImageResource(idsRow2Col1[j][1]);
                    ibArrayRow2[1].setImageResource(idsRow2Col2[j][1]);
                    ibArrayRow2[2].setImageResource(ids[j - 1][1]);
                    if (zombie[0] == NEW2)
                        ibArrayRow2[2].setImageResource(idsRow2Col1[j - 1][1]);
                    if (zombie[0] == NEW3)
                        ibArrayRow2[2].setImageResource(idsRow2Col2[j - 1][1]);

                    for (; i < 4 && j < 7; i++, j++) {
                        target[i] = target[j];
                        ibArray[i].setImageResource(ids[j][1]);
                    }

                } else if (appName[2].equalsIgnoreCase(temp)) {
                    for (int i = 0; i < 7; i++) {
                        target[i] = i;
                    }
//                    Toast.makeText(BeforeTravelling.this, "oyo,packpoint", Toast.LENGTH_SHORT).show();
                    int i = 0, j = 3;
                    ibArrayRow2[0].setImageResource(idsRow2Col1[j][1]);
                    ibArrayRow2[1].setImageResource(idsRow2Col2[j][1]);
                    ibArrayRow2[2].setImageResource(ids[j - 1][1]);
                    if (zombie[0] == NEW2)
                        ibArrayRow2[2].setImageResource(idsRow2Col1[j - 1][1]);
                    if (zombie[0] == NEW3)
                        ibArrayRow2[2].setImageResource(idsRow2Col2[j - 1][1]);

                    for (; i < 4 && j < 7; i++, j++) {
                        target[i] = target[j];
                        ibArray[i].setImageResource(ids[j][1]);
                    }

                } else if (appName[3].equalsIgnoreCase(temp)) {

//                    Toast.makeText(BeforeTravelling.this, "packpoint,tripadvisor", Toast.LENGTH_SHORT).show();
                    int i = 0, j = 4;
                    ibArrayRow2[0].setImageResource(idsRow2Col1[j][1]);
                    ibArrayRow2[1].setImageResource(idsRow2Col2[j][1]);
                    ibArrayRow2[2].setImageResource(ids[j - 1][1]);
                    if (zombie[0] == NEW2)
                        ibArrayRow2[2].setImageResource(idsRow2Col1[j - 1][1]);
                    if (zombie[0] == NEW3)
                        ibArrayRow2[2].setImageResource(idsRow2Col2[j - 1][1]);

                    for (; i < 4 && j < 7; i++, j++) {
                        target[i] = target[j];
                        ibArray[i].setImageResource(ids[j][1]);
                    }
                    ibArray[3].setClickable(false);
                    ibArray[3].setAlpha(0.5f);

                } else if (appName[4].equalsIgnoreCase(temp)) {

//                    Toast.makeText(BeforeTravelling.this, "tripadvisor,flipkart", Toast.LENGTH_SHORT).show();
                    int i = 0, j = 5;
                    ibArrayRow2[0].setImageResource(idsRow2Col1[j][1]);
                    ibArrayRow2[1].setImageResource(idsRow2Col2[j][1]);
                    ibArrayRow2[2].setImageResource(ids[j - 1][1]);
                    if (zombie[0] == NEW2)
                        ibArrayRow2[2].setImageResource(idsRow2Col1[j - 1][1]);
                    if (zombie[0] == NEW3)
                        ibArrayRow2[2].setImageResource(idsRow2Col2[j - 1][1]);

                    for (; i < 4 && j < 7; i++, j++) {
                        target[i] = target[j];
                        ibArray[i].setImageResource(ids[j][1]);
                    }
                    ibArray[2].setClickable(false);
                    ibArray[2].setAlpha(0.5f);

                } else if (appName[5].equalsIgnoreCase(temp)) {

//                    Toast.makeText(BeforeTravelling.this, "flipkart,mysmartprice", Toast.LENGTH_SHORT).show();
                    int i = 0, j = 6;
                    ibArrayRow2[0].setImageResource(idsRow2Col1[j][1]);
                    ibArrayRow2[1].setImageResource(idsRow2Col2[j][1]);
                    ibArrayRow2[2].setImageResource(ids[j - 1][1]);
                    if (zombie[0] == NEW2)
                        ibArrayRow2[2].setImageResource(idsRow2Col1[j - 1][1]);
                    if (zombie[0] == NEW3)
                        ibArrayRow2[2].setImageResource(idsRow2Col2[j - 1][1]);

                    for (; i < 4 && j < 7; i++, j++) {
                        target[i] = target[j];
                        ibArray[i].setImageResource(ids[j][1]);
                    }
                    ibArray[1].setClickable(false);
                    ibArray[1].setAlpha(0.5f);

                } else {
                    Toast.makeText(AfterReaching.this, "All Transactions Complete", Toast.LENGTH_SHORT).show();
                    Toast.makeText(AfterReaching.this, "Returning to Main Page...", Toast.LENGTH_LONG).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
//                            startActivity(new Intent(getApplicationContext(), MainPage.class));
                        }
                    }, 5000);
                }
            }
        });
    }
}
