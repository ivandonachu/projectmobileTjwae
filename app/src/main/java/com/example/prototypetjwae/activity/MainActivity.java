package com.example.prototypetjwae.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.prototypetjwae.R;
import com.example.prototypetjwae.fragment.JadwalFragment;
import com.example.prototypetjwae.fragment.MapsFragment;
import com.example.prototypetjwae.login.LogoutActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private Fragment selectedFragment = new JadwalFragment();
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        loadFragment(selectedFragment);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menu_bottomnav_jadwal:
                selectedFragment = new JadwalFragment();
                loadFragment(selectedFragment);
                break;

            case R.id.menu_bottomnav_maps:
                selectedFragment = new MapsFragment();
                loadFragment(selectedFragment);
                break;
        }
        return loadFragment(selectedFragment);
    }

    private boolean loadFragment(Fragment selectedFragment) {
        if(selectedFragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.framefragmentactivity,selectedFragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, AboutActivity.class));
        } else if (item.getItemId() == R.id.contact) {
            startActivity(new Intent(this, ContactActivity.class));
        } else if (item.getItemId() == R.id.btn_logout) {
            startActivity(new Intent(this, LogoutActivity.class));
        }

        return true;
    }


}
