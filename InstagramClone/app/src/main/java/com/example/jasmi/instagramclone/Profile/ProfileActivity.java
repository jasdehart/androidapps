package com.example.jasmi.instagramclone.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;

import com.example.jasmi.instagramclone.R;
import com.example.jasmi.instagramclone.Utils.BottomNavgationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toolbar.OnMenuItemClickListener;


public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;


    private Context mContext = ProfileActivity.this;
    private  ProgressBar mProgressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started");
        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);

        setupBottomNavigationView();
        setupToolbar();
    }

    /**
     * Responsible for setting up the profile toolbar
     */

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating to account settings.");
                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * *BottomNavigationView setup
     */

    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavgationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavgationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
