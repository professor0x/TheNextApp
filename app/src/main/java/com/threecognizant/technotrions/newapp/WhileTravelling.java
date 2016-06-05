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

public class WhileTravelling extends AppCompatActivity {


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
        setContentView(R.layout.activity_while_travelling);
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
        {   //games
            ids[0][0] = R.id.new1;
            ids[0][1] = R.drawable.angrybirds;
            target[0] = 0;
            intentPath[0] = "com.rovio.angrybirds";
            ibArray[0] = (ImageButton) findViewById(R.id.new1);
            temp = ibArray[0].toString();
            appName[0] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            //books
            ids[1][0] = R.id.next1;
            ids[1][1] = R.drawable.amazonkindle;
            target[1] = 1;
            intentPath[1] = "com.amazon.kindle";
            ibArray[1] = (ImageButton) findViewById(R.id.next1);
            temp = ibArray[1].toString();
            appName[1] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            //music
            ids[2][0] = R.id.next2;
            ids[2][1] = R.drawable.gaana;
            target[2] = 2;
            intentPath[2] = "com.gaana";
            ibArray[2] = (ImageButton) findViewById(R.id.next2);
            temp = ibArray[2].toString();
            appName[2] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            //photography
            ids[3][0] = R.id.next3;
            ids[3][1] = R.drawable.chrome;
            target[3] = 3;
            intentPath[3] = "com.android.chrome";
            ibArray[3] = (ImageButton) findViewById(R.id.next3);
            temp = ibArray[3].toString();
            appName[3] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            //messaging
            ids[4][0] = R.id.next4;
            ids[4][1] = R.drawable.whatsapp;
            target[4] = 4;
            intentPath[4] = "com.whatsapp";
            ibArray[4] = (ImageButton) findViewById(R.id.next4);
            temp = ibArray[4].toString();
            appName[4] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
//            appName[4] = "tripadvisor";

            //sharing
            ids[5][0] = R.id.next5;
            ids[5][1] = R.drawable.shareit;
            target[5] = 5;
            intentPath[5] = "com.lenovo.anyshare.gps";
            ibArray[5] = (ImageButton) findViewById(R.id.next5);
            temp = ibArray[5].toString();
            appName[5] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
//            appName[5] = "flipkart";

            //news
            ids[6][0] = R.id.next6;
            ids[6][1] = R.drawable.toi;
            target[6] = 6;
            intentPath[6] = "com.toi.reader.activities";
            ibArray[6] = (ImageButton) findViewById(R.id.next6);
            temp = ibArray[6].toString();
            appName[6] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);
//            appName[6] = "mysmartprice";

            ibArrayRow2[0] = (ImageButton) findViewById(R.id.new2);
            ibArrayRow2[1] = (ImageButton) findViewById(R.id.new3);
            ibArrayRow2[2] = (ImageButton) findViewById(R.id.zombie);
            ibArrayRow2[2].setVisibility(View.INVISIBLE);

        }
        //some prob with R.java, new drawable IDs don't show up
        {
            idsRow2Col1[0][0] = R.id.subwaysurfer;
            idsRow2Col1[0][1] = R.drawable.subwaysurfer;
            intentPathRow2Col1[0] = "com.kiloo.subwaysurf";
            appNameRow2Col1[0] = "subwaysurf";

            idsRow2Col2[0][0] = R.id.twozerofoureight;
            idsRow2Col2[0][1] = R.drawable.twozerofoureight;
            intentPathRow2Col2[0] = "com.gabrielecirulli.app2048";
            appNameRow2Col2[0] = "app2048";
        }
        {
            idsRow2Col1[1][0] = 0x7f0200a9;
            idsRow2Col1[1][1] = R.drawable.quora;
            intentPathRow2Col1[1] = "com.quora.android";
            appNameRow2Col1[1] = "quora";

            idsRow2Col2[1][0] = 0x7f0200a8;
            idsRow2Col2[1][1] = R.drawable.pocket;
            intentPathRow2Col2[1] = "com.ideashower.readitlater.pro";
            appNameRow2Col2[1] = "pocket";
        }
        {
            idsRow2Col1[2][0] = R.id.saavn;
            idsRow2Col1[2][1] = R.drawable.saavn;
            intentPathRow2Col1[2] = "com.saavn.android";
            appNameRow2Col1[2] = "saavn";

            idsRow2Col2[2][0] = 0x7f02009c;
            idsRow2Col2[2][1] = R.drawable.mxplayer;
            intentPathRow2Col2[2] = "com.mxtech.videoplayer.ad";
            appNameRow2Col2[2] = "mxplayer";
        }
        {
            idsRow2Col1[3][0] = 0x7f020081;
            idsRow2Col1[3][1] = R.drawable.firefox;
            intentPathRow2Col1[3] = "org.mozilla.firefox";
            appNameRow2Col1[3] = "firefox";

            idsRow2Col2[3][0] = 0x7f0200a4;
            idsRow2Col2[3][1] = R.drawable.operamini;
            intentPathRow2Col2[3] = "com.opera.mini.native";
            appNameRow2Col2[3] = "operamini";
        }
        {
            idsRow2Col1[4][0] = R.id.hike;
            idsRow2Col1[4][1] = R.drawable.hike;
            intentPathRow2Col1[4] = "com.bsb.hike";
            appNameRow2Col1[4] = "hike";

            idsRow2Col2[4][0] = 0x7f020097;
            idsRow2Col2[4][1] = R.drawable.messenger;
            intentPathRow2Col2[4] = "com.facebook.orca";
            appNameRow2Col2[4] = "messenger";
        }
        {
            idsRow2Col1[5][0] = 0x7f0200aa;
            idsRow2Col1[5][1] = R.drawable.radon;
            intentPathRow2Col1[5] = "com.nam.radon.app";
            appNameRow2Col1[5] = "radon";

            idsRow2Col2[5][0] = 0x7f0200b4;
            idsRow2Col2[5][1] = R.drawable.sync;
            intentPathRow2Col2[5] = "com.bittorrent.sync";
            appNameRow2Col2[5] = "bittorrentsync";
        }
        {
            idsRow2Col1[6][0] = R.id.hindu;
            idsRow2Col1[6][1] = R.drawable.thehindu;
            intentPathRow2Col1[6] = "com.mobstac.thehindu";
            appNameRow2Col1[6] = "thehindu";

            idsRow2Col2[6][0] = 0x7f02008f;
            idsRow2Col2[6][1] = R.drawable.inshorts;
            intentPathRow2Col2[6] = "com.nis.app";
            appNameRow2Col2[6] = "inshorts";
        }

        final int NEW1 = 1;
        final int NEW2 = 2;
        final int NEW3 = 3;


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
                    Toast.makeText(WhileTravelling.this, "All Transactions Complete", Toast.LENGTH_SHORT).show();
                    Toast.makeText(WhileTravelling.this, "Returning to Main Page...", Toast.LENGTH_LONG).show();
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
