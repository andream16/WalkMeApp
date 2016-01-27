package com.project.so2.walkmeapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.j256.ormlite.dao.Dao;
import com.project.so2.walkmeapp.ORM.DBTrainings;

import org.w3c.dom.Text;

import java.util.Date;

/**
 * Created by Andrea on 24/01/2016.
 */
public class LoadTrainings extends Activity{

    private static final String TAG = "LoadTrainings";
    private Dao<DBTrainings, String> dbTrainingDao;
    private String[] mLoadTrainingsElements;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Binding Class to its View
        setContentView(R.layout.load_trainings);

        //Binding Strings to their View
        mLoadTrainingsElements = getResources().getStringArray(R.array.load_trainings_list_items);

        ImageView actionBar = (ImageView) findViewById(R.id.action_bar_icon);
        actionBar.setImageResource(R.drawable.btn_back);
        actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView actionBarText = (TextView) findViewById(R.id.action_bar_title);

        actionBarText.setText(getResources().getString(R.string.load_trainings_title));

/*        Date sburro = new Date();

        sburro.getTime();

        TextView dataSbu = (TextView) findViewById(R.id.datasburro);
        Log.d(TAG, "timestamp " + sburro.toString());

        dataSbu.setText(sburro.toString() );*/

    }
}


/*
{
        "id : "0",
        "trainingDate" : "Wed Jan 27 15:30:56 GMT+01:00 2016" ,
        "trainingSteps" : "500",
        "trainingDuration" : trainingDuration,
        "trainingDistance" : trainingDistance,
        "lastMetersSettings" : lastMetersSettings,
        "avgTotSpeed" : avgTotSpeed,
        "avgXSpeed" : avgXSpeed,
        "avgTotSteps" : avgTotSteps,
        "avgXSteps" : avgXSteps,
        "stepLenghtInCm" : stepLenghtInCm
}
 */
