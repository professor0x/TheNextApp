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

public class Games extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton angrybirds = (ImageButton) findViewById(R.id.angrybirds);
        angrybirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.rovio.angrybirds");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=com.rovio.angrybirds"));
                }
                startActivity(i);
            }
        });


        ImageButton subwaysurfer = (ImageButton) findViewById(R.id.subwaysurfer);
        subwaysurfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.kiloo.subwaysurf");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=com.kiloo.subwaysurf"));
                }
                startActivity(i);
            }
        });

        final ImageButton twozerofoureight = (ImageButton) findViewById(R.id.twozerofoureight);
        twozerofoureight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean flag = true;
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.gabrielecirulli.app2048");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    /*Bundle b = new Bundle();
                    i.putExtras(b);*/
//                    startActivityForResult(i, 0);
                    startActivity(i);
                    /*finish();*/
                } catch (PackageManager.NameNotFoundException e) {
                    i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=com.gabrielecirulli.app2048"));
                    flag = false;
                }


                /*if (flag) {
                    //twozerofoureight.setImageResource(R.drawable.toi);
                    i = new Intent(Games.this, news.class);
                    startActivity(i);
                }*/
                /*Intent BackpressedIntent = new Intent();
                BackpressedIntent.setClass(getApplicationContext(), news.class);
                BackpressedIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(BackpressedIntent);
                finish();*/
            }
        });

        final Button updateButton = (Button) findViewById(R.id.updateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //setContentView(R.layout.activity_games);/*
                //ibArray[3]=ibArray[0];

                /*ibArray[0].setImageResource(R.drawable.makemytrip);
                ibArray[1].setImageResource(R.drawable.oyo);
                ibArray[2].setImageResource(R.drawable.packpoint);
                ibArray[3].setImageResource(R.drawable.ola);*/
                //ibArray[1].setForeground(ibArray[0].getDrawable());
                finish();
                Intent i = new Intent(Games.this, messaging.class);
                startActivity(i);
            }
        });
    }
}

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0){
            Toast.makeText(Games.this, "Req Code is 0", Toast.LENGTH_SHORT).show();
//            if(resultCode==RESULT_OK){
                Intent i = new Intent(Games.this, news.class);
                startActivity(i);
//            }
        }
    }*/

    /*@Override
    public void onActivityReenter(int resultCode, Intent data) {
        //super.onActivityReenter(resultCode, data);
//            if (resultCode == RESULT_OK) {
                //Intent i = new Intent(Games.this, news.class);
                startActivity(data);
//            }
    }*/
