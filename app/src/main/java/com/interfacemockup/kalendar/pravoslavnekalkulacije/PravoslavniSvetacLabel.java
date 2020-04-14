package com.interfacemockup.kalendar.pravoslavnekalkulacije;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatTextView;
import com.interfacemockup.kalendar.R;

import java.util.Date;

public class PravoslavniSvetacLabel extends AppCompatTextView {

    private PravoslavniKalendar sharedKalendar = PravoslavniKalendar.getInstance();
    private PravoslavneKonstante konstante = new PravoslavneKonstante();

    public PravoslavniSvetacLabel(Context context) {
        super(context);
    }

    public PravoslavniSvetacLabel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PravoslavniSvetacLabel(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @SuppressLint("ResourceType")
    public String setSvetacText(int counter){

        Calendar cal = GregorianCalendar.getInstance();
        String[] imeSvetitelja;
        if (cal.isLenient()){
            imeSvetitelja = getResources().getStringArray(R.array.imena_svetitelja_prestupna_godina);
        }else {
            imeSvetitelja = getResources().getStringArray(R.array.imena_svetitelja_prosta_godina);
        }

        return imeSvetitelja[counter];
    }



    public String setSvetacText(int mesec, int dan){

        Calendar cal = GregorianCalendar.getInstance();
        String[] imeSvetitelja;

        PravoslavniKalendar kal = PravoslavniKalendar.getInstance();
        int redniBroj = kal.getRBDanauGodini(mesec, dan);
        if (cal.isLenient()){
            imeSvetitelja = getResources().getStringArray(R.array.imena_svetitelja_prestupna_godina);
        }else {
            imeSvetitelja = getResources().getStringArray(R.array.imena_svetitelja_prosta_godina);
        }

        return imeSvetitelja[redniBroj];
    }



    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.N)
    public String[] imenaSvetitelja(int counter){

        Calendar cal = GregorianCalendar.getInstance();
        Date novidatum = sharedKalendar.getNovidatum(counter);

        if (cal.isLenient()){
            //return getResources().getStringArray(R.array.imena_svetitelja_prestupna_godina[counter]);
            return getResources().getStringArray(R.array.imena_svetitelja_prestupna_godina);
        }else {
            //return getResources().getStringArray(R.array.imena_svetitelja_prosta_godina[counter]);
            return getResources().getStringArray(R.array.imena_svetitelja_prosta_godina);
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void setBojuTexta(int counter){
        if (sharedKalendar.getRBDanauNedelji(counter) == 7){
            this.setTextColor(Color.parseColor("#CF331F"));
        }else {
            this.setTextColor(Color.parseColor("#CCD4D4"));
        }
    }


    public void setBojuTexta(int mesec, int dan){
        if (sharedKalendar.getRBDanauNedelji(mesec, dan) == 7){
            this.setTextColor(Color.parseColor("#CF331F"));
        }else {
            this.setTextColor(Color.parseColor("#CCD4D4"));
        }
    }


}
