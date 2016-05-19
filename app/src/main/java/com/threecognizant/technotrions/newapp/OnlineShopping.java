package com.threecognizant.technotrions.newapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class OnlineShopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_shopping);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageButton[] flipkart = {(ImageButton) findViewById(R.id.flipkart)};
        //ImageButton targetonFlipkart;

        flipkart[0].setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i;
                boolean flag=true;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.flipkart.android");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Toast.makeText(OnlineShopping.this, "App not installed on device", Toast.LENGTH_SHORT).show();
                    flag=false;
                }
                if (flag) {
                    flipkart[0].setImageResource(R.drawable.mysmartprice);
                }
            }
        });
    }

}
