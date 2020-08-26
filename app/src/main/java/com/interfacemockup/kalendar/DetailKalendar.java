package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniKalendar;

import java.util.Arrays;

public class DetailKalendar extends AppCompatActivity {

    private int _day;
    private int _month;
    private ImageView _ikona;
    private TextView _svetac;
    private TextView _zitije;
    private PravoslavneKonstante _konst;
    private ListView _list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kalendar);



        //new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("4F93385764579C780A11C861D3268329"));

        _konst = new PravoslavneKonstante();
        _ikona = findViewById(R.id.ikona);
        _svetac = findViewById(R.id.svetac);
        _zitije = findViewById(R.id.zitije);
        _zitije.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        _day = intent.getIntExtra("day", 0);
        _month = intent.getIntExtra("month", 0);

        setUI(_month, _day);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.sample_anim);
        _ikona.startAnimation(anim);

/*        Animation anim = AnimationUtils.loadAnimation(this, R.anim.down_anim);
        _ikona.startAnimation(anim);*/

        // Obtain BannerView.
        BannerView bannerView = findViewById(R.id.hw_kalendar_banner);
//
        bannerView.setAdId("a19e0ravav");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);

        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);


    }


    private void setUI(int mesec, int dan){
        switch (mesec){
            case 0:
                // Januar
                _ikona.setImageResource(_konst.drawables_januar[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_januar)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_januar)[dan]);
                break;
            case 1:
                // Februar
                if (PravoslavniKalendar.getInstance().prestupnaGodina()){
                    _ikona.setImageResource(_konst.drawables_februar_big[dan]);
                    _svetac.setText(getResources().getStringArray(R.array.svetitelji_februar_big)[dan]);
                    _zitije.setText(getResources().getStringArray(R.array.zitija_februar_big)[dan]);
                }else {
                    _ikona.setImageResource(_konst.drawables_februar_small[dan]);
                    _svetac.setText(getResources().getStringArray(R.array.svetitelji_februar_small)[dan]);
                    _zitije.setText(getResources().getStringArray(R.array.zitija_februar_small)[dan]);
                }
                break;
            case 2:
                //Mart
                _ikona.setImageResource(_konst.drawables_mart[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_mart)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_mart)[dan]);

                break;
            case 3:
                //April
                _ikona.setImageResource(_konst.drawables_april[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_april)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_april)[dan]);

                break;
            case 4:
                //Maj
                _ikona.setImageResource(_konst.drawables_maj[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_majs)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_maj)[dan]);

                break;
            case 5:
                //JUN
                _ikona.setImageResource(_konst.drawables_jun[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_jun)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitije_jun)[dan]);

                break;
            case 6:
                //Jul
                _ikona.setImageResource(_konst.drawables_jul[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_jul)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_jul)[dan]);

                break;
            case 7:
                //Avgust
                _ikona.setImageResource(_konst.drawables_avgust[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_avgust)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_avgust)[dan]);

                break;
            case 8:
                //Septembar
                _ikona.setImageResource(_konst.drawables_septembar[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_septembar)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_septembar)[dan]);

                break;
            case 9:
                //Oktobar
                _ikona.setImageResource(_konst.drawables_oktobar[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_oktobar)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_oktobar)[dan]);

                break;
            case 10:
                //Nobvembar
                _ikona.setImageResource(_konst.drawables_novembar[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_novembar)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_novembar)[dan]);

                break;
            case 11:
                //Decembar
                _ikona.setImageResource(_konst.drawables_decembar[dan]);
                _svetac.setText(getResources().getStringArray(R.array.svetitelji_decembar)[dan]);
                _zitije.setText(getResources().getStringArray(R.array.zitija_decembar)[dan]);

                break;
            default:
                break;

        }

    }


    public void backDetail(View view) {
        Intent backIntent = new Intent();
        backIntent.putExtra("mmm", _month);
        backIntent.putExtra("dan", _day);
        setResult(RESULT_OK, backIntent);
        finish();
    }




}


