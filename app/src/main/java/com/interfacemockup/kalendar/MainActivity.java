package com.interfacemockup.kalendar;

import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavnaIkona;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniGregorijanskiDatumLabel;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniJulijanskiDatumLabel;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniPostLabel;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniSvetacLabel;

import java.util.Date;

import hotchemi.android.rate.AppRate;

import static android.content.ContentValues.TAG;
import static com.interfacemockup.kalendar.R.*;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.banner.BannerView;

public class MainActivity extends AppCompatActivity {

   // private static final String TAG = "MyActivity";

    private PravoslavniPostLabel _postLabel;
    private PravoslavniGregorijanskiDatumLabel _gregorijanskiDatumLabel;
    private PravoslavnaIkona _ikona;
    private PravoslavniSvetacLabel _svetitelj;
    private PravoslavniJulijanskiDatumLabel _julijanskiDatumLabel;
    private View _view;

   // private ImageView _kalendarImage;
   // private ImageView _infoImage;

    private int _rb_danaUgodini = 0;
    private Calendar _calendar;
    private int _counter;
    private PravoslavniKalendar shared_kalendar_instance;
    private PravoslavneKonstante _konstante;


    int _toggle;

    private Button _btn_kal;



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //_btn_kal = findViewById(id.btn_kal);
       // _btn_kal.setAlpha(0);




        //rateApp();

        _counter = 0;
        _toggle = 0;
        _calendar = GregorianCalendar.getInstance();
        shared_kalendar_instance = PravoslavniKalendar.getInstance();
        _konstante = new PravoslavneKonstante();
        _rb_danaUgodini = shared_kalendar_instance.vratiBrojDana(_counter);
        _view = findViewById(id.bgView);
        _postLabel = findViewById(id.idPostLabe);
        _gregorijanskiDatumLabel = findViewById(id.idGregorijanskiDatumLabel);
        _ikona = findViewById(id.idIkona);
        _svetitelj = findViewById(id.idSvetacLabel);
        _julijanskiDatumLabel = findViewById(id.idJulijanskiDatumLabel);

        setUI(_counter);
        setSwipes(_rb_danaUgodini);

        // Obtain BannerView.
        BannerView bannerView = findViewById(id.hw_danas_banner);
        bannerView.setAdId("v7yfo37tkh");
        bannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_320_50);
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);



    }// onCreate



    @Override
    protected void onResume() {
        super.onResume();
      //  _btn_kal.setAlpha(0);

    }

    @Override
    protected void onPause() {
        super.onPause();

    }


    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onRestart() {
        super.onRestart();


    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void setUI(int counter_to_add){

        _postLabel.setPostLabelText(counter_to_add);
        _postLabel.setPostLabelColor(counter_to_add);

        _gregorijanskiDatumLabel.napisiIzmenjeniDatum(counter_to_add);
        _gregorijanskiDatumLabel.setBojuTexta(counter_to_add);

        setIkonu(counter_to_add);
        setSvetitelja(counter_to_add);

        _julijanskiDatumLabel.napisiJulijanskiDatum(counter_to_add);
        _julijanskiDatumLabel.setBojuTexta(counter_to_add);





        //TODO: Ova funkcija ispod izgleda nije uopste potrebna osim za pronalazenje tokena
        //findMessageToken();

    }// setUI


    @RequiresApi(api = Build.VERSION_CODES.N)
    private void setIkonu(int counter){
        Calendar cal = GregorianCalendar.getInstance();

        if (cal.isLenient()){
            _ikona.setImageResource(_konstante.dravables_prestupna_godina[shared_kalendar_instance.vratiBrojDana(counter)- 1]);

        }else {
            _ikona.setImageResource(_konstante.drawables_prosta_godina[shared_kalendar_instance.vratiBrojDana(counter) - 1]);
        }

    }// setIkonu

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void setSvetitelja(int counter){
        Calendar cal = GregorianCalendar.getInstance();
        String[] imeSvetitelja;
        if (cal.isLenient()){
            imeSvetitelja = getResources().getStringArray(array.imena_svetitelja_prestupna_godina);
        }else {
            imeSvetitelja = getResources().getStringArray(array.imena_svetitelja_prosta_godina);
        }
        _svetitelj.setText(imeSvetitelja[shared_kalendar_instance.vratiBrojDana(counter) - 1]);
        _svetitelj.setBojuTexta(counter);
    }// setSvetitelja




    /*  TODO: SWIPE GESTURES AND ANIMATIONS     */
    public void setSwipes(int rb_dana_u_god) {
        _view.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {


            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                YoYo.with(Techniques.ZoomInRight)
                        .duration(650)
                        .repeat(0)
                        .playOn(_ikona);
                _rb_danaUgodini = _rb_danaUgodini + 1;
                _counter = _counter + 1;
                setUI(_counter);
            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                YoYo.with(Techniques.ZoomInLeft)
                        .duration(650)
                        .repeat(0)
                        .playOn(_ikona);
                _rb_danaUgodini = _rb_danaUgodini - 1;
                _counter = _counter - 1;
                setUI(_counter);
            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                YoYo.with(Techniques.ZoomIn)
                        .duration(550)
                        .repeat(0)
                        .playOn(_ikona);
                _rb_danaUgodini = _calendar.get(Calendar.DAY_OF_YEAR)-1;
                _counter = 0;
                setUI(_counter);
            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                YoYo.with(Techniques.ZoomIn)
                        .duration(550)
                        .repeat(0)
                        .playOn(_ikona);
                _rb_danaUgodini = _calendar.get(Calendar.DAY_OF_YEAR)-1;
                _counter = 0;
                setUI(_counter);
            }

        }); // setOnTouchListener

    }// setSwipes











    

    public void otvoriKalendar(View view) {
        Intent intent = new Intent(this, GodisnjiKalendar.class);
        startActivity(intent);
    }

    public void otvoriKatihizis(View view) {
        Intent intent = new Intent(this, KatihizisDva.class);
        startActivity(intent);
    }

    public void sharePravoslavca(View view) {

        Intent intent = new Intent(this, Obicaji.class);
        startActivity(intent);

    }

    public void otvoriMolitvenik(View view) {
        Intent intent = new Intent(this, Molitve.class);
        startActivity(intent);
    }

    public void otvoriInfo(View view) {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }


    public void otvoriTortu(View view) {

/*        if (_toggle == 0){
           // _ikona.setTranslationY((float) 1000);
            TranslateAnimation animation = new TranslateAnimation(0, 0, _ikona.getTop(), 1000);
            _toggle = 1;
        }else{
            _ikona.setTranslationY((float) 0);
            _toggle = 0;
        }*/



/*try {
    _btn_kal.setAlpha(1);
}catch (Error e){
    System.out.println(e);
}*/


        Intent intent = new Intent(this, NektarijeSpisak.class);
        startActivity(intent);

    }



    private void rateApp(){
        AppRate.with(this)
                .setInstallDays(3)
                .setLaunchTimes(5)
                .setTitle("Оцените Православни Календар")
                .setMessage("Да ли би сте оценили ову апликацији ако сте задовољни са њом? То би вам одузело само неколико тренутака. Захваљујем се на вашој подршци!")
                .setTextLater("Оценићу касније")
                .setTextRateNow("Оценићу сада")
                .setTextNever("Не, хвала")
                .setShowNeverButton(false)
                .setRemindInterval(5)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void otvori_danasnje_zitije(View view) {

        int index = shared_kalendar_instance.getRedniBrojDanaUGodini(_counter);
        int mesec = shared_kalendar_instance.mes(_counter);
        int dan_Mesec = shared_kalendar_instance.get_Mesec(_counter);

        Intent intent = new Intent(this, ZitijeDva.class);
        intent.putExtra("day", index - 1);
        intent.putExtra("month", mesec);
        intent.putExtra("monthDay", dan_Mesec - 1);
        intent.putExtra("counter", _counter);
        startActivity(intent);
    }



}


