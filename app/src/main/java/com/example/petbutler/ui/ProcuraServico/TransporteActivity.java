package com.example.petbutler.ui.ProcuraServico;

/*In progress*/
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.petbutler.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class TransporteActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        final ArrayList<LatLng> altransporte = new ArrayList<>();

        LatLng palladium = new LatLng(-25.4778215, -49.291088);
        LatLng curitiba = new LatLng(-25.4409947, -49.2795614);
        LatLng barigui = new LatLng(-25.4352014, -49.3186704);
        LatLng angeloni = new LatLng(-25.4544463, -49.2904308);
        altransporte.add(palladium);
        altransporte.add(curitiba);
        altransporte.add(barigui);
        altransporte.add(angeloni);

        mMap.addMarker(new MarkerOptions().position(altransporte.get(0)).title("Marker in Shopping Palladium"));
        mMap.addMarker(new MarkerOptions().position(altransporte.get(1)).title("Marker in Shopping Curitiba"));
        mMap.addMarker(new MarkerOptions().position(altransporte.get(2)).title("Marker in Shopping Barigui"));
        mMap.addMarker(new MarkerOptions().position(altransporte.get(3)).title("Marker in Angeloni"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(altransporte.get(0)));
    }
}
