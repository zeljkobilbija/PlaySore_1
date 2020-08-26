package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;


public class KatihizisDetail extends AppCompatActivity {

    private int _counter;
    private ImageView _backBtn;
    private TextView _odgovor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katihizis_detail);


        Intent intent = getIntent();
        _counter = intent.getIntExtra("pitanje", -1);
        //_counter = getIntent().getIntExtra("pitanje", 0);

        //_backBtn = findViewById(R.id.id_back_kat_detail);
        _odgovor = findViewById(R.id.id_kat_odovor_text_view);
        setOdgovor(_counter);

        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_katihizis_banner);

        bannerView.setAdId("j6x1dpabel");
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


}
