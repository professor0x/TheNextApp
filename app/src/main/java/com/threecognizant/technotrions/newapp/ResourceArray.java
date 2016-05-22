package com.threecognizant.technotrions.newapp;

import android.widget.ImageButton;

/**
 * Created by Prateek on 22-05-2016.
 */
public interface ResourceArray {
    //int ids[][]=new int[4][4]; //row is R.id, column is R.drawable
    int ids[][] = {
            {R.id.ola, R.drawable.ola},
            {R.id.makemytrip, R.drawable.makemytrip},
            {R.id.oyo, R.drawable.oyo},
            {R.id.packpoint, R.drawable.packpoint}
    };
    ImageButton ibArray[] = new ImageButton[4];
    String intentPath[] = new String[30]; //target packages
    int target[] = new int[1];
    //ib2Array = ibArray; //backup, since ibArray will continuously change

}
