package com.interfacemockup.kalendar;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.iid.FirebaseInstanceId;

public class Info extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        MobileAds.initialize(this, "ca-app-pub-7920431183682527~1369121836");

        GoogleApiAvailability.getInstance().makeGooglePlayServicesAvailable(Info.this);
        FirebaseInstanceId.getInstance().getInstanceId();

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


    public void nazad(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


    private void addMob(){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.reklama);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
