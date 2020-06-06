package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class KatihizisDetail extends AppCompatActivity {

    private int _counter;
    private ImageView _backBtn;
    private TextView _odgovor;

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katihizis_detail);

        MobileAds.initialize(this, "ca-app-pub-7920431183682527~1369121836");

        Intent intent = getIntent();
        _counter = intent.getIntExtra("pitanje", -1);
        //_counter = getIntent().getIntExtra("pitanje", 0);

        //_backBtn = findViewById(R.id.id_back_kat_detail);
        _odgovor = findViewById(R.id.id_kat_odovor_text_view);
        setOdgovor(_counter);

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


    public void backDetail(View view) {

        Intent backIntent = new Intent();
        backIntent.putExtra("ppp", _counter);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    private void setOdgovor(int brojac){
        _odgovor.setText(getResources().getStringArray(R.array.katehizis_odgovori)[brojac]);
    }

    public void vrati_na_main(View view) {
       // Intent intent = new Intent(getApplicationContext(), KatihizisDva.class);
        //startActivity(intent);

        Intent backIntent = new Intent();
        backIntent.putExtra("ppp", _counter);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    private void addMob(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.id_kat_detail);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
