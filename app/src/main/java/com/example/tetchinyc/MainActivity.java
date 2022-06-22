package com.example.tetchinyc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tetchinyc.view.Listener;
import com.example.tetchinyc.view.SchoolDetails;
import com.example.tetchinyc.view.SchoolDisplay;

public class MainActivity extends AppCompatActivity implements Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDisplayFragment();
    }

    private void showDisplayFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SchoolDisplay())
                .commit();
    }

    @Override
    public void openDetails(String dbn) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SchoolDetails().getInstance(dbn))
                .addToBackStack(null)
                .commit();
    }

}