package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;

public class NektarijeDetail extends AppCompatActivity {

    private TextView _molitva;
    private PravoslavneKonstante _konst;
    private int _counter;

    private TextView _naslov;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moltva_detail);

        _counter = getIntent().getIntExtra("nektarije", 0);
       // MobileAds.initialize(this, "ca-app-pub-7920431183682527~1369121836");
        _naslov = findViewById(R.id.naslov_molive);
        _naslov.setText(getResources().getStringArray(R.array.spisak_vrlina)[_counter]);

        _molitva = findViewById(R.id.id_text_molitve);
        // _molitva.setText(_konst.molitveTekst[_counter]);
        _molitva.setText(getResources().getStringArray(R.array.vrline_detail)[_counter]);
        _molitva.setMovementMethod(new ScrollingMovementMethod());

        if (GlobalnaClassa.getInstance().getPokaziAdMob()){
            addMob();
        }

    }


    private void addMob(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        mAdView = findViewById(R.id.adMolitva);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
