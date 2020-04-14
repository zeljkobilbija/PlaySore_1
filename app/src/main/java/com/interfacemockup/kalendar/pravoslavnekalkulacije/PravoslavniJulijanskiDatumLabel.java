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

public class PravoslavniJulijanskiDatumLabel extends AppCompatTextView {

    private PravoslavniKalendar sharedKalendar = PravoslavniKalendar.getInstance();

    public PravoslavniJulijanskiDatumLabel(Context context) {
        super(context);
    }

    public PravoslavniJulijanskiDatumLabel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PravoslavniJulijanskiDatumLabel(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void napisiJulijanskiDatum(int counter){
        String pattern = "d. MMMM yyyy.";
        Date stariDatum = sharedKalendar.setStariDatum(counter);
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
        String date = sdf.format(stariDatum);
        String dd = date + " god.";
        this.setText(dd);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void setBojuTexta(int counter){
       // if (sharedKalendar.getRBDanauNedelji(counter) == 7){
       //     this.setTextColor(Color.parseColor("#CF331F"));
        // }else {
        //    this.setTextColor(Color.parseColor("#BC9432"));
        //}

        this.setTextColor(Color.parseColor("#BC9432"));

    }


}
