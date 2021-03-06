package com.interfacemockup.kalendar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniKalendar;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniSvetacLabel;

public class ZitijeDva extends AppCompatActivity {

    private int _dan;
    private int _mesec;
    private int _dan_mes;
    private int _counter;
    private PravoslavneKonstante _konst;
    boolean prestupna;
    private ImageView _ikona;
    private PravoslavniSvetacLabel _svetac;
    private TextView _zitije;

    private PravoslavniKalendar _sharedKalendar;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zitije_dva_activity);



        _sharedKalendar = PravoslavniKalendar.getInstance();
        _konst = new PravoslavneKonstante();

       prestupna = _sharedKalendar.prestupnaGodina();

        _ikona = findViewById(R.id.ikona_dva);
        _svetac = findViewById(R.id.svetac_dva);
        _zitije = findViewById(R.id.zitije_dva);
        _zitije.setMovementMethod(new ScrollingMovementMethod());


        Intent intent = getIntent();
        _dan = intent.getIntExtra("day", 0);
        _mesec = intent.getIntExtra("month", 0);
        _dan_mes = intent.getIntExtra("monthDay", 0);
        _counter = intent.getIntExtra("counter", 0);

        _svetac.setBojuTexta(_counter);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.sample_anim);
        _ikona.startAnimation(anim);

        setZitije(_mesec);

        if (prestupna){
            _svetac.setText(getResources().getStringArray(R.array.imena_svetitelja_prestupna_godina)[_dan]);

        }else {
            _svetac.setText(getResources().getStringArray(R.array.imena_svetitelja_prosta_godina)[_dan]);
        }

        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_zitije_dva_banner);
        bannerView.setAdId("j0rawspf7i");
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


    private void setZitije(int rbMeseca){
        switch (rbMeseca){
            case 0:
                _ikona.setImageResource(_konst.drawables_januar[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_januar)[_dan_mes]);
                return;
            case 1:
                if (prestupna){
                    _ikona.setImageResource(_konst.drawables_februar_big[_dan_mes]);
                    _zitije.setText(getResources().getStringArray(R.array.zitija_februar_big)[_dan_mes]);
                }else {
                    _ikona.setImageResource(_konst.drawables_februar_small[_dan_mes]);
                    _zitije.setText(getResources().getStringArray(R.array.zitija_februar_small)[_dan_mes]);
                }
                return;
            case 2:
                _ikona.setImageResource(_konst.drawables_mart[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_mart)[_dan_mes]);
                return;
            case 3:
                _ikona.setImageResource(_konst.drawables_april[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_april)[_dan_mes]);
                return;
            case 4:
                _ikona.setImageResource(_konst.drawables_maj[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_maj)[_dan_mes]);
                return;
            case 5:
                _ikona.setImageResource(_konst.drawables_jun[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitije_jun)[_dan_mes]);
                return;
            case 6:
                _ikona.setImageResource(_konst.drawables_jul[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_jul)[_dan_mes]);
                return;
            case 7:
                _ikona.setImageResource(_konst.drawables_avgust[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_avgust)[_dan_mes]);
                return;
            case 8:
                _ikona.setImageResource(_konst.drawables_septembar[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_septembar)[_dan_mes]);
                return;
            case 9:
                _ikona.setImageResource(_konst.drawables_oktobar[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_oktobar)[_dan_mes]);
                return;
            case 10:
                _ikona.setImageResource(_konst.drawables_novembar[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_novembar)[_dan_mes]);
                return;
            case 11:
                _ikona.setImageResource(_konst.drawables_decembar[_dan_mes]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_decembar)[_dan_mes]);
                return;
            default:
                return;
        }
    }


}
