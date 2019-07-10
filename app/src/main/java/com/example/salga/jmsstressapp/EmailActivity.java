package com.example.salga.jmsstressapp;

import android.content.Intent;
import android.os.Build;
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
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.GONE;

public class EmailActivity extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bt1 = findViewById(R.id.WelcomeLetterButton);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setVisibility(GONE);
                bt2.setVisibility(GONE);
                bt3.setVisibility(GONE);
                bt4.setVisibility(GONE);
                bt5.setVisibility(GONE);
                bt6.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                WelcomeLetterFragment fragment = new WelcomeLetterFragment();
                fm.beginTransaction().replace(R.id.EmailLayout, fragment).commit();
            }
        });

        bt2 = findViewById(R.id.NewsletterButton);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2.setVisibility(GONE);
                bt1.setVisibility(GONE);
                bt3.setVisibility(GONE);
                bt4.setVisibility(GONE);
                bt5.setVisibility(GONE);
                bt6.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                NewsletterFragment fragment = new NewsletterFragment();
                fm.beginTransaction().replace(R.id.EmailLayout, fragment).commit();
            }
        });

        bt3 = findViewById(R.id.MilestoneButton);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3.setVisibility(GONE);
                bt1.setVisibility(GONE);
                bt2.setVisibility(GONE);
                bt4.setVisibility(GONE);
                bt5.setVisibility(GONE);
                bt6.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                MilestoneFragment fragment = new MilestoneFragment();
                fm.beginTransaction().replace(R.id.EmailLayout, fragment).commit();
            }
        });

        bt4 = findViewById(R.id.OfferEmailButton);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4.setVisibility(GONE);
                bt1.setVisibility(GONE);
                bt2.setVisibility(GONE);
                bt3.setVisibility(GONE);
                bt5.setVisibility(GONE);
                bt6.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                OfferEmailFragment fragment = new OfferEmailFragment();
                fm.beginTransaction().replace(R.id.EmailLayout, fragment).commit();
            }
        });

        bt5 = findViewById(R.id.SurveyButton);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt5.setVisibility(GONE);
                bt4.setVisibility(GONE);
                bt1.setVisibility(GONE);
                bt2.setVisibility(GONE);
                bt3.setVisibility(GONE);
                bt6.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                SurveyFragment fragment = new SurveyFragment();
                fm.beginTransaction().replace(R.id.EmailLayout, fragment).commit();
            }
        });

        bt6 = findViewById(R.id.HiringButton);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt6.setVisibility(GONE);
                bt5.setVisibility(GONE);
                bt4.setVisibility(GONE);
                bt1.setVisibility(GONE);
                bt2.setVisibility(GONE);
                bt3.setVisibility(GONE);
                FragmentManager fm = getSupportFragmentManager();
                HiringFragment fragment = new HiringFragment();
                fm.beginTransaction().replace(R.id.EmailLayout, fragment).commit();
            }
        });

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.nav_tasks:
                        Intent intent1 = new Intent(EmailActivity.this, TasksActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_calendar:
                        Intent intent2 = new Intent(EmailActivity.this, CalendarActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_email:
                        Intent intent3 = new Intent(EmailActivity.this, EmailActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_stress:
                        Intent intent4 = new Intent(EmailActivity.this, StressActivity.class);
                        startActivity(intent4);
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
                    bt1 = findViewById(R.id.WelcomeLetterButton);
                    bt1.setVisibility(GONE);
                    bt2 = findViewById(R.id.NewsletterButton);
                    bt2.setVisibility(GONE);
                    bt3 = findViewById(R.id.MilestoneButton);
                    bt3.setVisibility(GONE);
                    bt4 = findViewById(R.id.OfferEmailButton);
                    bt4.setVisibility(GONE);
                    bt5 = findViewById(R.id.SurveyButton);
                    bt5.setVisibility(GONE);
                    bt6 = findViewById(R.id.HiringButton);
                    bt6.setVisibility(GONE);
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

