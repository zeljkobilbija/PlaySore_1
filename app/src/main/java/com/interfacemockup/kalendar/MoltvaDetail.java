package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;

public class MoltvaDetail extends AppCompatActivity {

    private TextView _molitva;
    private TextView _naslov_moliyve;
    private PravoslavneKonstante _konst;
    private int _counter;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.molitva_detail_activity);
        _counter = getIntent().getIntExtra("molitva", 0);

        MobileAds.initialize(this, "ca-app-pub-7920431183682527~1369121836");

        _konst = new PravoslavneKonstante();
        _molitva = findViewById(R.id.id_text_molitve);
        _naslov_moliyve = findViewById(R.id.naslov_molive);
       // _molitva.setText(_konst.molitveTekst[_counter]);
        _molitva.setText(getResources().getStringArray(R.array.molitve_tekst)[_counter]);
        _naslov_moliyve.setText(getResources().getStringArray(R.array.molitve)[_counter]);

        _molitva.setMovementMethod(new ScrollingMovementMethod());

        if (GlobalnaClassa.getInstance().getPokaziAdMob()){
            addMob();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (GlobalnaClassa.getInstance().getPokaziAdMob()){
            addMob();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (GlobalnaClassa.getInstance().getPokaziAdMob()){
            addMob();
        }
    }


    public void kliknazad_sa_molitvi_detail(View view) {
/*        Intent intent = new Intent(getApplicationContext(), Molitve.class);
        startActivity(intent);*/

        Intent backIntent = new Intent();
        backIntent.putExtra("molitva", _counter);
        setResult(RESULT_OK, backIntent);
        finish();
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
