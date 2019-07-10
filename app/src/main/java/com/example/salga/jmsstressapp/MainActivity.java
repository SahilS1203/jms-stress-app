package com.example.salga.jmsstressapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.nav_tasks:
                    Intent intent1 = new Intent(MainActivity.this, TasksActivity.class);
                    startActivity(intent1);
                    break;

                case R.id.nav_calendar:
                    Intent intent2 = new Intent(MainActivity.this, CalendarActivity.class);
                    startActivity(intent2);
                    break;

                case R.id.nav_email:
                    Intent intent3 = new Intent(MainActivity.this, EmailActivity.class);
                    startActivity(intent3);
                    break;

                case R.id.nav_stress:
                    Intent intent4 = new Intent(MainActivity.this, StressActivity.class);
                    startActivity(intent4);
                    break;

            }

            return true;
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
                TextView about = findViewById(R.id.AboutText);
                about.setVisibility(GONE);
                ImageView logo = findViewById(R.id.JMSLogo);
                logo.setVisibility(GONE);
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


