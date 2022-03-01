package com.enrashe.myles;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.enrashe.myles.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in madrid and move the camera
        LatLng madrid = new LatLng(40.4165, -3.70256);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Marker in Madrid"));


        LatLng almendrales = new LatLng(40.384264, -3.698360);
        mMap.addMarker(new MarkerOptions().position(almendrales).title("Marker in Almendrales"));


        LatLng peñuelas = new LatLng(  40.401083, -3.705321);
        mMap.addMarker(new MarkerOptions().position(peñuelas).title("Marker in peñuelas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(peñuelas));

        LatLng carbanchel = new LatLng(  40.388761, -3.731504);
        mMap.addMarker(new MarkerOptions().position(carbanchel).title("Marker in carabanchel"));

        LatLng vallecas = new LatLng(  40.379678, -3.613738);
        mMap.addMarker(new MarkerOptions().position(vallecas).title("Marker in vallecas"));

        LatLng vicalvaro = new LatLng(  40.391640, -3.598023);
        mMap.addMarker(new MarkerOptions().position(vicalvaro).title("Marker in vicalvaro"));

        LatLng retiro = new LatLng(  40.415231, -3.687681);
        mMap.addMarker(new MarkerOptions().position(retiro).title("Marker in retiro"));

        LatLng centro = new LatLng(  40.417483, -3.717363);
        mMap.addMarker(new MarkerOptions().position(centro).title("Marker in centro"));

        LatLng moncloa = new LatLng(  40.435034, -3.719485);
        mMap.addMarker(new MarkerOptions().position(moncloa).title("Marker in moncloa"));

        LatLng tetuan = new LatLng(  40.467302605215096, -3.7111738955066764);
        mMap.addMarker(new MarkerOptions().position(tetuan).title("Marker in tetuan"));

        LatLng hortaleza = new LatLng(  40.452274, -3.630122);
        mMap.addMarker(new MarkerOptions().position(hortaleza).title("Marker in hortaleza"));

        LatLng sanblasCanillejas = new LatLng(  40.44135438231836, -3.623352101886986);
        mMap.addMarker(new MarkerOptions().position(sanblasCanillejas).title("Marker in SanblasCanillejas"));

        LatLng moratalaz = new LatLng(  40.41339032881335, -3.6387305112511137);
        mMap.addMarker(new MarkerOptions().position(moratalaz).title("Marker in moratalaz"));

        LatLng fuencarral = new LatLng(  40.49747390352379, -3.6935830738839366);
        mMap.addMarker(new MarkerOptions().position(fuencarral).title("Marker in fuencarral"));

        LatLng villaverde = new LatLng(  40.3588238063757, -3.7158991345895163);
        mMap.addMarker(new MarkerOptions().position(villaverde).title("Marker in villaverde"));

        LatLng latina = new LatLng(  40.37766876343604, -3.758848966861017);
        mMap.addMarker(new MarkerOptions().position(latina).title("Marker in latina"));
    }
}