package com.example.salga.jmsstressapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import static android.view.View.GONE;

public class StressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stress_activity);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.nav_tasks:
                        Intent intent1 = new Intent(StressActivity.this, TasksActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_calendar:
                        Intent intent2 = new Intent(StressActivity.this, CalendarActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_email:
                        Intent intent3 = new Intent(StressActivity.this, EmailActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_stress:
                        break;

                }

                return false;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settingsmenu, menu);
        return true;
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {

                case R.id.item1:
                    VideoView videoView = findViewById(R.id.video_view);
                    videoView.setVisibility(GONE);
                    android.support.v4.app.Fragment newFragment = new HelpFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, newFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    //frame_container is the id of the container for the fragment
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }


}
