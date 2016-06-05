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

public class BeforeTravelling extends AppCompatActivity {


    ImageButton ibArray[];
    ImageButton ibArrayRow2[];
    ImageButton ibArrayRow3[];
    ImageButton ibArrayRow4[];


    int ids[][]; //row is R.id, column is R.drawable
    int target[];
    String intentPath[]; //target packages
    String appName[];

    int idsRow2[][]; //row is R.id, column is R.drawable
    String intentPathRow2[]; //target packages
    String appNameRow2[];

    int idsRow3[][]; //row is R.id, column is R.drawable
    String intentPathRow3[]; //target packages
    String appNameRow3[];

    int idsRow4[][]; //row is R.id, column is R.drawable
    String intentPathRow4[]; //target packages
    String appNameRow4[];

    String temp, temp2, temp3;
    String var1, var2, var3;
    String reco1, reco2, reco3, reco4, reco5, reco6;

    int zombie[];
    int count[];
    int recos[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_travelling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

//declarations start
        {
            ids = new int[7][2];
            target = new int[7];
            intentPath = new String[7];
            //main apps
            ibArray = new ImageButton[7];
            appName = new String[7];
        }
        {

            //variety apps1
            ibArrayRow2 = new ImageButton[7];
            //variety apps2
            ibArrayRow3 = new ImageButton[7];
            //zombie apps
            ibArrayRow4 = new ImageButton[7];
            count = new int[7];
        }
        {
            idsRow2 = new int[7][2];
            intentPathRow2 = new String[7];
            appNameRow2 = new String[7];
        }
        {
            idsRow3 = new int[7][2];
            intentPathRow3 = new String[7];
            appNameRow3 = new String[7];
        }


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
            idsRow2 = new int[7][2];
            intentPathRow2 = new String[7];
            appNameRow2 = new String[7];
        }
        {
            idsRow2 = new int[7][2];
            intentPathRow2 = new String[7];
            appNameRow2 = new String[7];
        }
        {
            recos = new int[1];
            zombie = new int[1];
        }

//declarations end
//initializations start
        {
            ids[0][0] = R.id.new1;
            ids[0][1] = R.drawable.ola;
            target[0] = 0;
            intentPath[0] = "com.olacabs.customer";
            ibArray[0] = (ImageButton) findViewById(R.id.new1);
            temp = ibArray[0].toString();
            appName[0] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[1][0] = R.id.senior1;
            ids[1][1] = R.drawable.makemytrip;
            target[1] = 1;
            intentPath[1] = "com.makemytrip";
            ibArray[1] = (ImageButton) findViewById(R.id.senior1);
            temp = ibArray[1].toString();
            appName[1] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[2][0] = R.id.supersenior1;
            ids[2][1] = R.drawable.oyo;
            target[2] = 2;
            intentPath[2] = "com.oyo.consumer";
            ibArray[2] = (ImageButton) findViewById(R.id.supersenior1);
            temp = ibArray[2].toString();
            appName[2] = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

            ids[3][0] = R.id.zombie1;
            ids[3][1] = R.drawable.packpoint;
            target[3] = 3;
            intentPath[3] = "com.YRH.PackPoint";
            ibArray[3] = (ImageButton) findViewById(R.id.zombie1);
            ibArray[3].setVisibility(View.INVISIBLE);
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
            idsRow2[0][0] = R.id.uber;
            idsRow2[0][1] = R.drawable.uber;
            intentPathRow2[0] = "com.ubercab";
            appNameRow2[0] = "uber";

            idsRow3[0][0] = R.id.redbus;
            idsRow3[0][1] = R.drawable.redbus;
            intentPathRow3[0] = "in.redbus.android";
            appNameRow3[0] = "redbus";
        }
        {
            idsRow2[1][0] = R.id.cleartrip;
            idsRow2[1][1] = R.drawable.cleartrip;
            intentPathRow2[1] = "com.cleartrip.android";
            appNameRow2[1] = "cleartrip";

            idsRow3[1][0] = R.id.irctc;
            idsRow3[1][1] = R.drawable.irctc;
            intentPathRow3[1] = "com.irctc.main";
            appNameRow3[1] = "irctc";
        }
        {
            idsRow2[2][0] = R.id.touristeye;
            idsRow2[2][1] = R.drawable.touristeye;
            intentPathRow2[2] = "com.touristeye";
            appNameRow2[2] = "touristeye";

            idsRow3[2][0] = 0x7f02009f;
            idsRow3[2][1] = R.drawable.stayzilla;
            intentPathRow3[2] = "com.stayzilla.booking";
            appNameRow3[2] = "stayzilla";
        }
        {
            idsRow2[3][0] = R.id.anydo;
            idsRow2[3][1] = R.drawable.anydo;
            intentPathRow2[3] = "com.anydo";
            appNameRow2[3] = "anydo";

            idsRow3[3][0] = R.id.Todoist;
            idsRow3[3][1] = R.drawable.todoist;
            intentPathRow3[3] = "com.todoist";
            appNameRow3[3] = "todoist";
        }
        {
            idsRow2[4][0] = R.id.goibibo;
            idsRow2[4][1] = R.drawable.goibibo;
            intentPathRow2[4] = "com.goibibo";
            appNameRow2[4] = "goibibo";

            idsRow3[4][0] = R.id.trivago;
            idsRow3[4][1] = R.drawable.trivago;
            intentPathRow3[4] = "com.trivago";
            appNameRow3[4] = "trivago";
        }
        {
            idsRow2[5][0] = R.id.snapdeal;
            idsRow2[5][1] = R.drawable.snapdeal;
            intentPathRow2[5] = "com.snapdeal.main";
            appNameRow2[5] = "snapdeal";

            idsRow3[5][0] = R.id.amazon;
            idsRow3[5][1] = R.drawable.amazon;
            intentPathRow3[5] = "in.amazon.mShop.android.shopping";
            appNameRow3[5] = "amazon";
        }
        {
            idsRow2[6][0] = R.id.myntra;
            idsRow2[6][1] = R.drawable.shopclues;
            intentPathRow2[6] = "com.shopclues";
            appNameRow2[6] = "shopclues";

            idsRow3[6][0] = R.id.snapdeal;
            idsRow3[6][1] = R.drawable.coupondunia;
            intentPathRow3[6] = "in.coupondunia.androidapp";
            appNameRow3[6] = "coupondunia";
        }

        final int NEW1 = 1;
        final int NEW2 = 2;
        final int NEW3 = 3;

        ibArrayRow2[0] = (ImageButton) findViewById(R.id.new2);
        ibArrayRow3[0] = (ImageButton) findViewById(R.id.new3);

        ibArrayRow2[1] = (ImageButton) findViewById(R.id.senior2);
        ibArrayRow3[1] = (ImageButton) findViewById(R.id.senior3);

        ibArrayRow2[2] = (ImageButton) findViewById(R.id.supersenior2);
        ibArrayRow3[2] = (ImageButton) findViewById(R.id.supersenior3);

        ibArrayRow2[3] = (ImageButton) findViewById(R.id.zombie2);
        ibArrayRow2[3].setVisibility(View.INVISIBLE);
        ibArrayRow3[3] = (ImageButton) findViewById(R.id.zombie3);
        ibArrayRow3[3].setVisibility(View.INVISIBLE);

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
                    i = manager.getLaunchIntentForPackage(intentPath[target[0] - 1]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPath[target[0] - 1]));
                    startActivity(i);
                }
            }
        });

        ibArrayRow2[0].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow2[target[0]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow2[target[0]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
                zombie[0] = NEW2;
            }
        });
        ibArrayRow3[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow3[target[0]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow3[target[0]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
                zombie[0] = NEW3;
            }
        });

        ibArrayRow2[1].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow2[target[1]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow2[target[1]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
            }
        });
        ibArrayRow3[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow3[target[1]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow3[target[1]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
            }
        });
        ibArrayRow2[2].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow2[target[2]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow2[target[2]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
            }
        });
        ibArrayRow3[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow3[target[2]]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow3[target[2]]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
            }
        });
        ibArrayRow2[3].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow2[target[0] - 1]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow2[target[0] - 1]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
            }
        });
        ibArrayRow3[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(BeforeTravelling.this, appNameRow2Col1[recos[0]] + " matches", Toast.LENGTH_SHORT).show();
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage(intentPathRow3[target[0] - 1]);
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + intentPathRow3[target[0] - 1]));
                    startActivity(i);
                } finally {
//                        count[target[0]]++;
                }
            }
        });


        fab.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View view) {
                                       ibArray[3].setVisibility(View.VISIBLE);
                                       ibArrayRow2[3].setVisibility(View.VISIBLE);
                                       ibArrayRow3[3].setVisibility(View.VISIBLE);

                                       temp = ibArray[target[0]].toString();
                                       temp = temp.substring(temp.lastIndexOf('/') + 1, temp.length() - 1);

                                       if (appName[0].equalsIgnoreCase(temp)) {
//            Toast.makeText(BeforeTravelling.this, "{ola,uber,redbus} >> {makemytrip,cleartrip,irctc}", Toast.LENGTH_SHORT).show();
                                           int i = 0, j = 1;
                                           ibArray[3].setImageResource(ids[j - 1][1]);
                                           ibArrayRow2[3].setImageResource(idsRow2[j - 1][1]);
                                           ibArrayRow3[3].setImageResource(idsRow3[j - 1][1]);
                                           for (; i < 3 && j < 7; i++, j++) {
                                               target[i] = target[j];
                                               ibArray[i].setImageResource(ids[j][1]);
                                               ibArrayRow2[i].setImageResource(idsRow2[j][1]);
                                               ibArrayRow3[i].setImageResource(idsRow3[j][1]);
                                           }
                                       }
                                       //next, new, new, zombie
                                       else if (appName[1].equalsIgnoreCase(temp)) {
                                           for (int i = 0; i < 7; i++) {
                                               target[i] = i;
                                           }
//            Toast.makeText(BeforeTravelling.this, "{makemytrip,cleartrip,irctc} >> {oyo,touristeye,stayzilla}", Toast.LENGTH_SHORT).show();
                                           int i = 0, j = 2;
                                           ibArray[3].setImageResource(ids[j - 1][1]);
                                           ibArrayRow2[3].setImageResource(idsRow2[j - 1][1]);
                                           ibArrayRow3[3].setImageResource(idsRow3[j - 1][1]);
                                           for (; i < 3 && j < 7; i++, j++) {
                                               target[i] = target[j];
                                               ibArray[i].setImageResource(ids[j][1]);
                                               ibArrayRow2[i].setImageResource(idsRow2[j][1]);
                                               ibArrayRow3[i].setImageResource(idsRow3[j][1]);
                                           }
                                       }
                                       //next, new, zombie, popular
                                       else if (appName[2].equalsIgnoreCase(temp)) {
                                           for (int i = 0; i < 7; i++) {
                                               target[i] = i;
                                           }
//            Toast.makeText(BeforeTravelling.this, "{makemytrip,cleartrip,irctc} >> {oyo,touristeye,stayzilla}", Toast.LENGTH_SHORT).show();
                                           int i = 0, j = 3;
                                           ibArray[3].setImageResource(ids[j - 1][1]);
                                           ibArrayRow2[3].setImageResource(idsRow2[j - 1][1]);
                                           ibArrayRow3[3].setImageResource(idsRow3[j - 1][1]);
                                           for (; i < 3 && j < 7; i++, j++) {
                                               target[i] = target[j];
                                               ibArray[i].setImageResource(ids[j][1]);
                                               ibArrayRow2[i].setImageResource(idsRow2[j][1]);
                                               ibArrayRow3[i].setImageResource(idsRow3[j][1]);
                                           }
                                       }
                                       //next, new, zombie, popular
                                       else if (appName[3].equalsIgnoreCase(temp)) {
                                           for (int i = 0; i < 7; i++) {
                                               target[i] = i;
                                           }
//            Toast.makeText(BeforeTravelling.this, "{makemytrip,cleartrip,irctc} >> {oyo,touristeye,stayzilla}", Toast.LENGTH_SHORT).show();
                                           int i = 0, j = 4;
                                           ibArray[3].setImageResource(ids[j - 1][1]);
                                           ibArrayRow2[3].setImageResource(idsRow2[j - 1][1]);
                                           ibArrayRow3[3].setImageResource(idsRow3[j - 1][1]);
                                           for (; i < 3 && j < 7; i++, j++) {
                                               target[i] = target[j];
                                               ibArray[i].setImageResource(ids[j][1]);
                                               ibArrayRow2[i].setImageResource(idsRow2[j][1]);
                                               ibArrayRow3[i].setImageResource(idsRow3[j][1]);
                                           }
                                       }
                                       //next, new, zombie, popular
                                       else if (appName[4].equalsIgnoreCase(temp)) {
                                           for (int i = 0; i < 7; i++) {
                                               target[i] = i;
                                           }
//            Toast.makeText(BeforeTravelling.this, "{makemytrip,cleartrip,irctc} >> {oyo,touristeye,stayzilla}", Toast.LENGTH_SHORT).show();
                                           int i = 0, j = 5;
                                           ibArray[3].setImageResource(ids[j - 1][1]);
                                           ibArrayRow2[3].setImageResource(idsRow2[j - 1][1]);
                                           ibArrayRow3[3].setImageResource(idsRow3[j - 1][1]);
                                           for (; i < 3 && j < 7; i++, j++) {
                                               target[i] = target[j];
                                               ibArray[i].setImageResource(ids[j][1]);
                                               ibArrayRow2[i].setImageResource(idsRow2[j][1]);
                                               ibArrayRow3[i].setImageResource(idsRow3[j][1]);
                                           }
                                           ibArray[2].setClickable(false);
                                           ibArray[2].setAlpha(0.5f);
                                           ibArrayRow2[2].setClickable(false);
                                           ibArrayRow2[2].setAlpha(0.5f);
                                           ibArrayRow3[2].setClickable(false);
                                           ibArrayRow3[2].setAlpha(0.5f);
                                       }
                                       //next, zombie, popular, popular2
                                       else if (appName[5].equalsIgnoreCase(temp)) {
                                           for (int i = 0; i < 7; i++) {
                                               target[i] = i;
                                           }
//            Toast.makeText(BeforeTravelling.this, "{makemytrip,cleartrip,irctc} >> {oyo,touristeye,stayzilla}", Toast.LENGTH_SHORT).show();
                                           int i = 0, j = 6;
                                           ibArray[3].setImageResource(ids[j - 1][1]);
                                           ibArrayRow2[3].setImageResource(idsRow2[j - 1][1]);
                                           ibArrayRow3[3].setImageResource(idsRow3[j - 1][1]);
                                           for (; i < 3 && j < 7; i++, j++) {
                                               target[i] = target[j];
                                               ibArray[i].setImageResource(ids[j][1]);
                                               ibArrayRow2[i].setImageResource(idsRow2[j][1]);
                                               ibArrayRow3[i].setImageResource(idsRow3[j][1]);
                                           }
                                           ibArray[1].setClickable(false);
                                           ibArray[1].setAlpha(0.5f);
                                           ibArrayRow2[1].setClickable(false);
                                           ibArrayRow2[1].setAlpha(0.5f);
                                           ibArrayRow3[1].setClickable(false);
                                           ibArrayRow3[1].setAlpha(0.5f);
                                       } else {
                                           Toast.makeText(BeforeTravelling.this, "All Transactions Complete", Toast.LENGTH_SHORT).show();
                                           Toast.makeText(BeforeTravelling.this, "Returning to Main Page...", Toast.LENGTH_LONG).show();
                                           new Handler().postDelayed(new Runnable() {
                                               @Override
                                               public void run() {
                                                   finish();
//                            startActivity(new Intent(getApplicationContext(), MainPage.class));
                                               }
                                           }, 5000);
                                       }
                                   }
                               }

        );

    }

}
