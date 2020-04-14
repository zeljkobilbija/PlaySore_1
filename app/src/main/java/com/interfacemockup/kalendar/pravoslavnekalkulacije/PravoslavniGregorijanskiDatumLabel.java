package com.interfacemockup.kalendar.pravoslavnekalkulacije;

import android.content.Context;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatTextView;

import java.util.Date;
import java.util.Locale;

@RequiresApi(api = Build.VERSION_CODES.N)
public class PravoslavniGregorijanskiDatumLabel extends AppCompatTextView {

    private PravoslavniKalendar sharedKalendar = PravoslavniKalendar.getInstance();

    public PravoslavniGregorijanskiDatumLabel(Context context) {
        super(context);
    }

    public PravoslavniGregorijanskiDatumLabel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    //Pice datum umanjen ili uvecan za broj dana izrazenim u counteru
    public void napisiIzmenjeniDatum(int counter){
        String pattern = "d. MMMM yyyy.";
        String paternDan = "EEEE ";
        Date novidatum = sharedKalendar.getNovidatum(counter);
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
        SimpleDateFormat danFormat = new SimpleDateFormat(paternDan, locale);
        String date = sdf.format(novidatum);
        String danDate = danFormat.format(novidatum);
        String dd = danDate + date + " god.";
        this.setText(dd);
    }

    public void setBojuTexta(int counter){
        if (sharedKalendar.getRBDanauNedelji(counter) == 7){
            this.setTextColor(Color.parseColor("#CF331F"));
        }else {
            this.setTextColor(Color.parseColor("#CCD4D4"));
        }
    }



}