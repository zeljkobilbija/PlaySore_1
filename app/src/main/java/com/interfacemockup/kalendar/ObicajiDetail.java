package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;


public class ObicajiDetail extends AppCompatActivity {

    private int _selektor;
    private TextView _naslov;
    private  TextView _obicaj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obicaji_detail_activity);



        _naslov = findViewById(R.id.id_naslov_obicaja);
        _obicaj = findViewById(R.id.id_obicaj_text_detail);
        _obicaj.setMovementMethod(new ScrollingMovementMethod());


        Intent intent = getIntent();
        _selektor = intent.getIntExtra("obicaj", 0);

        String naslov = getResources().getStringArray(R.array.spisak_obicaja)[_selektor];
        String obicaj = getResources().getStringArray(R.array.detail_obicaja)[_selektor];

        _naslov.setText(naslov);
        _obicaj.setText(obicaj);

        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_obicaji_banner);

        bannerView.setAdId("o6tug9iy1u");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);

        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);

        if (GlobalnaClassa.getInstance().getPokaziAdMob()){

        }
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
