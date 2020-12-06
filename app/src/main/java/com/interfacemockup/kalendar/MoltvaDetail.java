package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;


import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;

public class MoltvaDetail extends AppCompatActivity {

    private TextView _molitva;
    private TextView _naslov_moliyve;
    private PravoslavneKonstante _konst;
    private int _counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moltva_detail);
        _counter = getIntent().getIntExtra("molitva", 0);


        _konst = new PravoslavneKonstante();
        _molitva = findViewById(R.id.id_text_molitve);
        _naslov_moliyve = findViewById(R.id.naslov_molive);
       // _molitva.setText(_konst.molitveTekst[_counter]);
        _molitva.setText(getResources().getStringArray(R.array.molitve_tekst)[_counter]);
        _naslov_moliyve.setText(getResources().getStringArray(R.array.molitve)[_counter]);

        _molitva.setMovementMethod(new ScrollingMovementMethod());

        BannerView bannerView = findViewById(R.id.hw_molitva_banner);
//
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


    public void kliknazad_sa_molitvi_detail(View view) {
/*        Intent intent = new Intent(getApplicationContext(), Molitve.class);
        startActivity(intent);*/

        Intent backIntent = new Intent();
        backIntent.putExtra("molitva", _counter);
        setResult(RESULT_OK, backIntent);
        finish();
    }


}
