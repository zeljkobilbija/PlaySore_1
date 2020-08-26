package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;

public class NektarijeDetail extends AppCompatActivity {

    private TextView _molitva;
    private PravoslavneKonstante _konst;
    private int _counter;

    private TextView _naslov;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nektarije_detail_activity);


        _counter = getIntent().getIntExtra("nektarije", 0);
        _naslov = findViewById(R.id.naslov_nektarije);
        _naslov.setText(getResources().getStringArray(R.array.spisak_vrlina)[_counter]);

        _molitva = findViewById(R.id.id_text_nektarijev);
        // _molitva.setText(_konst.molitveTekst[_counter]);
        _molitva.setText(getResources().getStringArray(R.array.vrline_detail)[_counter]);
        _molitva.setMovementMethod(new ScrollingMovementMethod());


        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_nektarije_banner);
        bannerView.setAdId("l5zqgfqp4y");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);

    }


    @Override
    protected void onResume() {
        super.onResume();
        if (GlobalnaClassa.getInstance().getPokaziAdMob()){

        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if (GlobalnaClassa.getInstance().getPokaziAdMob()){

        }
    }


}
