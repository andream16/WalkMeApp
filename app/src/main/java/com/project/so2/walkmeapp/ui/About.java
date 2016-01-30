package com.project.so2.walkmeapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.so2.walkmeapp.R;

/**
 * Created by Andrea on 30/01/2016.
 */
public class About extends Activity {

    //private String[] mSettingsElements;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Binding Class to its View
        setContentView(R.layout.about_layout);

        //Binding Strings to their View
        //mSettingsElements = getResources().getStringArray(R.array.settings_list_items);

        ImageView actionBar = (ImageView) findViewById(R.id.action_bar_icon);
        actionBar.setImageResource(R.drawable.btn_back);
        actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Action Bar Title
        TextView actionBarText = (TextView) findViewById(R.id.action_bar_title);
        actionBarText.setText(getResources().getString(R.string.about_title));

    }
}
