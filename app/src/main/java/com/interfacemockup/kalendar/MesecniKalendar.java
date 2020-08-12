package com.interfacemockup.kalendar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniKalendar;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniPostLabel;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniSvetacLabel;

import java.util.ArrayList;

import static com.interfacemockup.kalendar.R.array.nazivi_meseca;
import static com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante.SELECTED_ROW;

public class MesecniKalendar extends AppCompatActivity {

    int redniBroj;
    private PravoslavniKalendar _kalendar;
    private PravoslavneKonstante _konstante;
    private ListView list_View;
    private String[] list_Item;
    private String datumField;
    private PravoslavniSvetacLabel _svetac_label;
    private String postField;
    private TextView nazivMeseca;
    //private MyCustomArrayAdapter adapter;
    private CustomArrayAdapterDva adapterDva;
    private ArrayList<Item> lista;
    private ArrayList<Item2> lista2;

    private String kojiJeMesec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesecni_kalendar);
        _konstante = new PravoslavneKonstante();
        _kalendar = new PravoslavniKalendar();




        list_View = findViewById(R.id.id_Trideset_dana_ListView);
        nazivMeseca = findViewById(R.id.id_mesec_textView);
        redniBroj = getIntent().getIntExtra("mesec", 0);
        lista = new ArrayList<>();
        lista2 = new ArrayList<>();


        list_View.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                //String value=adapter.getItem(position);
                // Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MesecniKalendar.this, DetailKalendar.class);
                intent.putExtra("day", position);
                intent.putExtra("month", redniBroj);
                startActivityForResult(intent, 1);

            }
        });
        mesec(redniBroj);
        izaberiMesecnuPlist(redniBroj);
    }

    public void backDetail(View view) {
        Intent backIntent = new Intent();
        backIntent.putExtra("mes", redniBroj);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                int rez = data.getIntExtra("mmm", 0);
                int day = data.getIntExtra("dan", 0);

                list_View.smoothScrollToPosition(day);
                redniBroj = rez;
            }
        }
    }

    public void mesecni_kal_home_btn_click(View view) {
/*        Intent intent = new Intent(MesecniKalendar.this, GodisnjiKalendar.class);
        startActivity(intent);*/

        Intent backIntent = new Intent();
        backIntent.putExtra("mes", redniBroj);
        setResult(RESULT_OK, backIntent);
        finish();
    }

    private void mesec(int izbor){
        switch (izbor){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                kojiJeMesec = getResources().getStringArray(nazivi_meseca)[izbor];

                break;
            default:
                break;
        }
    }



    private void izaberiMesecnuPlist(final int izbor){

        int godina = PravoslavniKalendar.getInstance().getTrenutnuGodinu();
        postField = "Post a mozda i ne";

        switch (izbor){
            case 0:
                list_Item = getResources().getStringArray(R.array.svetitelji_januar);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_januar[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 1:

                if (PravoslavniKalendar.getInstance().prestupnaGodina()){
                    list_Item = getResources().getStringArray(R.array.svetitelji_februar_big);
                    for (int i = 0; i <= 28; i++){
                        postField = _kalendar.postLabel(izbor, i+1);
                        datumField = _kalendar.datumLabel(izbor, i) + " год.";
                        lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_februar_big[i], datumField));
                    }
                }else {
                    list_Item = getResources().getStringArray(R.array.svetitelji_februar_small);
                    for (int i = 0; i <= 27; i++){
                        postField = _kalendar.postLabel(izbor, i+1);
                        datumField = _kalendar.datumLabel(izbor, i) + " год.";
                        lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_februar_small[i], datumField));
                    }
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 2:
                list_Item = getResources().getStringArray(R.array.svetitelji_mart);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_mart[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 3:
                list_Item = getResources().getStringArray(R.array.svetitelji_april);
                for (int i = 0; i <= 29; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_april[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);

                break;
            case 4:
                list_Item = getResources().getStringArray(R.array.svetitelji_majs);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_maj[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 5:
                list_Item = getResources().getStringArray(R.array.svetitelji_jun);
                for (int i = 0; i <= 29; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_jun[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 6:
                list_Item = getResources().getStringArray(R.array.svetitelji_jul);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_jul[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 7:
                list_Item = getResources().getStringArray(R.array.svetitelji_avgust);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_avgust[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 8:
                list_Item = getResources().getStringArray(R.array.svetitelji_septembar);
                for (int i = 0; i <= 29; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_septembar[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 9:
                list_Item = getResources().getStringArray(R.array.svetitelji_oktobar);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_oktobar[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 10:
                list_Item = getResources().getStringArray(R.array.svetitelji_novembar);
                for (int i = 0; i <= 29; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_novembar[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            case 11:
                list_Item = getResources().getStringArray(R.array.svetitelji_decembar);
                for (int i = 0; i <= 30; i++){
                    postField = _kalendar.postLabel(izbor, i+1);
                    datumField = _kalendar.datumLabel(izbor, i) + " год.";
                    lista2.add(new Item2(postField, list_Item[i],_konstante.drawables_decembar[i], datumField));
                }
                adapterDva = new CustomArrayAdapterDva(this, R.layout.dan_dan_cell, lista2);
                list_View.setAdapter(adapterDva);
                nazivMeseca.setText(getResources().getStringArray(nazivi_meseca)[izbor]);
                break;
            default:
                break;

        }
    }


    private String svetac(int mesec, int dan){
        PravoslavniKalendar kalendar = PravoslavniKalendar.getInstance();

        Calendar cal = GregorianCalendar.getInstance();
        String[] imeSvetitelja = new String[0];
        int RB_Dana_u_God = 0;
        PravoslavniSvetacLabel label;

        return imeSvetitelja[RB_Dana_u_God];
    }

}
