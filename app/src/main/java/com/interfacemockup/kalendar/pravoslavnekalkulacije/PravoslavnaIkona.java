package com.interfacemockup.kalendar.pravoslavnekalkulacije;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.interfacemockup.kalendar.R;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class PravoslavnaIkona extends ImageView {


    public PravoslavniKalendar sharedKalendar = PravoslavniKalendar.getInstance();
    public PravoslavneKonstante konstante = new PravoslavneKonstante();

    public PravoslavnaIkona(Context context) {
        super(context);
    }

    public PravoslavnaIkona(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PravoslavnaIkona(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PravoslavnaIkona(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    public void setIkonuTest(int redni_broj_dana_u_godini){
        this.setImageResource(R.drawable.cc);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void setIkonImage(int counter){

        Calendar cal = GregorianCalendar.getInstance();
        Date novidatum = sharedKalendar.getNovidatum(counter);

        if (cal.isLenient()){
            setImageResource(konstante.dravables_prestupna_godina[sharedKalendar.vratiBrojDana(counter) - 1]);
            // return konstante.dravables_prestupna_godina[sharedKalendar.vratiBrojDana(counter) - 1];
        }else {
            //return konstante.drawables_prosta_godina[sharedKalendar.vratiBrojDana(counter) - 1];
            setImageResource(konstante.drawables_prosta_godina[sharedKalendar.vratiBrojDana(counter) - 1]);
        }


    }


}
