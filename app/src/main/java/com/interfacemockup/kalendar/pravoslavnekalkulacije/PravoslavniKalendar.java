package com.interfacemockup.kalendar.pravoslavnekalkulacije;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import androidx.annotation.RequiresApi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PravoslavniKalendar {

    private Calendar _cal   = GregorianCalendar.getInstance();
    private int      _broj  = 0;
    private PravoslavneKonstante konstante = new PravoslavneKonstante();



    private static final PravoslavniKalendar instance = new PravoslavniKalendar();
    public PravoslavniKalendar() { }
    public static PravoslavniKalendar getInstance(){
        return instance;
    }







    public Date setStariDatum(int counter) {
        Calendar cal   = GregorianCalendar.getInstance();
        cal.add(Calendar.DATE, -13 + counter); // oduzima 13 dana
        return cal.getTime();
    }

    public boolean prestupnaGodina(){
        Calendar cal   = GregorianCalendar.getInstance();
        return cal.isLenient();
    }


    public Date getNovidatum(int counter){
        Calendar cal   = GregorianCalendar.getInstance();
        Date danas = cal.getTime();
        cal.add(Calendar.DATE, counter);
        return cal.getTime();
    }

    public Date getDatum(int mesec, int dan){
        Calendar cal   = GregorianCalendar.getInstance();
        Date danas = cal.getTime();
        cal.add(Calendar.MONTH, mesec);
        cal.add(Calendar.DAY_OF_MONTH, dan);
        return cal.getTime();
    }



    //Pice datum umanjen ili uvecan za broj dana izrazenim u counteru
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int vratiBrojGodine(int counter){
        String pattern = "yyyy";
        Date novidatum = this.getNovidatum(counter);
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
        String date = sdf.format(novidatum);
        int broj = Integer.parseInt(date);
        return broj;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public int vratiBrojDana(int counter){
        String pattern = "D";
        Date novidatum = this.getNovidatum(counter);
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
        String date = sdf.format(novidatum);
        int broj = Integer.parseInt(date);
        return broj;
    }


    public int getRedniBrojDanaUGodini(int counter){
        Calendar cal   = GregorianCalendar.getInstance();
        cal.set(Calendar.YEAR, getGodinu(counter));
        cal.getTime();

        _broj = cal.get(Calendar.DAY_OF_YEAR) + counter;
        return _broj;
    }

    public int getRBDanauGodini(int mesec, int dan){
        Calendar cal   = GregorianCalendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, mesec, dan);
        cal.getTime();

        int rb = cal.get(Calendar.DAY_OF_YEAR);
        return rb;
    }





    public int getGodinu(int counter){
        Date datum = getNovidatum(counter);
        String pattern = "yyyy";
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat godina = new SimpleDateFormat(pattern, locale);
        String god = godina.format(datum);
        return Integer.parseInt(god);
    }

    public int getTrenutnuGodinu(){

        Date now = new Date();
        String pattern = "yyyy";
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat godina = new SimpleDateFormat(pattern, locale);
        String god = godina.format(now);
        return Integer.parseInt(god);
    }


// TODO: OVO JE OK ZA SADA
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int getRBDanauNedelji(int counter){
        Date xyz = getNovidatum(counter);
        String pattern = "e";
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat rb_DanuNedelji = new SimpleDateFormat(pattern, locale);
        String rbDan = rb_DanuNedelji.format(xyz);
        return Integer.parseInt(rbDan);
    }

    public int getRBDanauNedelji(int mesec, int dan){
        Date xyz = getDatum(mesec, dan);
        String pattern = "e";
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat rb_DanuNedelji = new SimpleDateFormat(pattern, locale);
        String rbDan = rb_DanuNedelji.format(xyz);
        return Integer.parseInt(rbDan);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean nedeljaJe(int counter){
        return getRBDanauNedelji(counter) == 7;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean nedeljJe(int mesec, int dan){
        return getRBDanauNedelji(mesec, dan) == 7;
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean sredaJe(int counter){
        return getRBDanauNedelji(counter) == 3;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean sredaJe(int mesec, int dan){ return getRBDanauNedelji(mesec, dan) == 3; }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean petakJe(int counter){
        return getRBDanauNedelji(counter) == 5;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean petakJe(int mesec, int dan){
        return getRBDanauNedelji(mesec, dan) == 5;
    }



    public String datumLabel(int mesec, int dan){
        //String str = "";
        //int rbDanauGodini = this.getRBDanauGodini(mesec, dan);
        Calendar cal = GregorianCalendar.getInstance();
        cal.getTime();
        cal.set(Calendar.MONTH,mesec);
        cal.set(Calendar.DAY_OF_MONTH, dan + 1);
        Date datum = cal.getTime();
        String pattern = "EEEE, dd. MMMM yyyy.";
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat rb_DanuNedelji = new SimpleDateFormat(pattern, locale);
        String rbDan = rb_DanuNedelji.format(datum);

        return rbDan;
    }


    public String postLabel(int mesec, int dan){
        int rbDanauGodini = this.getRBDanauGodini(mesec, dan);
        konstante.izracunajVaskrs();
        String str = "";
        Calendar cal = GregorianCalendar.getInstance();
        cal.getTime();
        cal.set(Calendar.MONTH,mesec);
        cal.set(Calendar.DAY_OF_MONTH, dan);
        Date datum = cal.getTime();
        String pattern = "e";
        Locale locale = new Locale("sr", "SR");
        SimpleDateFormat rb_DanuNedelji = new SimpleDateFormat(pattern, locale);
        String rbDan = rb_DanuNedelji.format(datum);

        int rbdanaUned = Integer.parseInt(rbDan);

        //TODO: Ako je prestupna godina onda ide (rbDanauGodini+1), a ako nije onda ide samo (rbDanauGodini)??? Proveriti!!!
/*        if (this.prestupnaGodina()){

        }else {

        }*/
        //TODO: Ako je prestupna godina onda ide (rbDanauGodini+1), a ako nije onda ide samo (rbDanauGodini)??? Proveriti!!!

        if (rbDanauGodini+1 > 331 || rbDanauGodini < 7) {
            //this.setText("Божићни пост");
            str = "Божићни пост";

        }else if (rbDanauGodini+1 > konstante.vaskrsMali && rbDanauGodini+1 < konstante.vaskrsVeliki){
            //this.setText("Васкршњи пост");
            str = "Васкршњи пост";
        }else if (rbDanauGodini+1 > konstante.petrovskiPostMin && rbDanauGodini+1 < konstante.petrovskiPostMax){
            //this.setText("Петровски пост");
            str = "Петровски пост";
        }else if (rbDanauGodini+1 > 225 && rbDanauGodini+1 < 240){
            //this.setText("Госпојински пост");
            str =  "Госпојински пост";
        }else {
/*            if (rbdanaUned == 3 || rbdanaUned == 5){
                str = "ПОСТ";
            }else {
                str = " ";
            }*/

            if (rbdanaUned == 3){
                str = "ПОСТ";
            }else if (rbdanaUned == 5){
                str = "ПОСТ";
            }else {
                str = " ";
            }

        }
        return str;
    }




    public String setPostString(int mesec, int dan){
        int rbDanauGodini = this.getRBDanauGodini(mesec, dan);
        konstante.izracunajVaskrs();
        String str;

        if (rbDanauGodini > 331 || rbDanauGodini < 7) {
            //this.setText("Божићни пост");
            str = "Божићни пост";

        }else if (rbDanauGodini > konstante.vaskrsMali && rbDanauGodini < konstante.vaskrsVeliki){
            //this.setText("Васкршњи пост");
            str = "Васкршњи пост";
        }else if (rbDanauGodini > konstante.petrovskiPostMin && rbDanauGodini < konstante.petrovskiPostMax){
            //this.setText("Петровски пост");
            str = "Петровски пост";
        }else if (rbDanauGodini > 225 && rbDanauGodini < 240){
            //this.setText("Госпојински пост");
            str =  "Госпојински пост";
        }else {
            if ((this.petakJe(mesec, dan)) || (this.sredaJe(mesec, dan))){
                //this.setText("Пост");
                str =  "Пост";
            }
            else {
                //this.setText(" ");
                str =  "cc ";
            }
        }
        return str;
    }



    public String setTextZaPost(int counter, int mesec, int dan){
        int rbDanauGodini = this.getRBDanauGodini(mesec, dan);
        konstante.izracunajVaskrs();
        String boh = "";

        if (rbDanauGodini > 331 || rbDanauGodini < 7) {
            boh = "Божићни пост";
        }else if (rbDanauGodini > konstante.vaskrsMali && rbDanauGodini < konstante.vaskrsVeliki){
            boh = "Васкршњи пост";
        }else if (rbDanauGodini > konstante.petrovskiPostMin && rbDanauGodini < konstante.petrovskiPostMax){
            boh = "Петровски пост";
        }else if (rbDanauGodini > 225 && rbDanauGodini < 240){
            boh = "Госпојински пост";
        }else {
            if ((this.petakJe(counter)) || (this.sredaJe(counter))) {
                boh = "Пост";
            }
            else {
                boh = "ccccc ";
            }
        }
        return boh;
    }


}
