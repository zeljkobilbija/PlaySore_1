package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class ObicajiDetail extends AppCompatActivity {

    private int _selektor;
    private TextView _naslov;
    private  TextView _obicaj;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obicaji_detail);

        MobileAds.initialize(this, "ca-app-pub-7920431183682527~1369121836");


        _naslov = findViewById(R.id.id_naslov_obicaja);
        _obicaj = findViewById(R.id.id_obicaj_text_detail);
        _obicaj.setMovementMethod(new ScrollingMovementMethod());


        Intent intent = getIntent();
        _selektor = intent.getIntExtra("obicaj", 0);

        String naslov = getResources().getStringArray(R.array.spisak_obicaja)[_selektor];
        String obicaj = getResources().getStringArray(R.array.detail_obicaja)[_selektor];

        _naslov.setText(naslov);
        _obicaj.setText(obicaj);

    }

    private void addMob(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.id_obicaji_add);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
