package com.example.android.lab_6;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {

    // Somewhere in Australia
    //private final LatLng mDestinationLatLng = new LatLng(-33.8523341, 151.2106085);

    // Top of Bascom Hill
    private final LatLng mDestinationLatLng = new LatLng(43.0752189, -89.4043558);
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_map);

        mapFragment.getMapAsync(googleMap -> {
            mMap = googleMap;
            // code to display marker
            googleMap.addMarker(new MarkerOptions().position(mDestinationLatLng).title("Destination"));
        });
    }
}
