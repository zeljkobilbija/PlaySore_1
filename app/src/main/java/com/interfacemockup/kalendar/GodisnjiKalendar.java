package com.interfacemockup.kalendar;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;
import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavniKalendar;

import static com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante.SELECTED_ROW;

public class GodisnjiKalendar extends AppCompatActivity {

    View view;

    private ListView listView;
    private TextView textView;
    private PravoslavniKalendar _sharedKalendar;
    private int _godina;
    private String[] listItem;
    private PravoslavneKonstante _sharedConstante;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godisnji_kalendar);

        _sharedKalendar = PravoslavniKalendar.getInstance();
        _godina = _sharedKalendar.getTrenutnuGodinu();
        _sharedConstante = new PravoslavneKonstante();

        listView = findViewById(R.id.idDvanaestMeseciListView);
        textView = findViewById(R.id.id_godina_textView);
        listItem = getResources().getStringArray(R.array.nazivi_meseca);

        String str_godinaText = _godina + ". година";
        textView.setText(str_godinaText);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);

        final ArrayAdapter<String> adpt = new ArrayAdapter<>(this, R.layout.mesec_cell, R.id.id_mesec_cell_textView, listItem);

        listView.setAdapter(adpt);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(GodisnjiKalendar.this, MesecniKalendar.class);
                intent.putExtra("mesec", position);
               // startActivity(intent);
                startActivityForResult(intent, 1);
            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                int rez = data.getIntExtra("mes", 0);
                listView.smoothScrollToPosition(rez);
            }
        }
    }


    public void home_btn_click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
