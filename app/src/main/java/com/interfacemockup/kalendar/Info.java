package com.interfacemockup.kalendar;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;


public class Info extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        BannerView bannerView = findViewById(R.id.hw_info_banner);
//
        bannerView.setAdId("x6yg2bpoj9");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);

        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);

    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }


    public void nazad(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


}
