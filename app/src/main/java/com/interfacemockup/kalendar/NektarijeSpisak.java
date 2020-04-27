package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class NektarijeSpisak extends AppCompatActivity {

    private TextView _naslov;
    private ListView listView;// List View gore pomenut pod brojem 1.
    private TextView textView;// TextView iz Cella iz drugog ffajla
    private String[] listItem;// Arraj koji ce biti predstavljen u tom ListViewu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molitve);

        _naslov = findViewById(R.id.textView2);
        _naslov.setText("Свети Нектарије Егински");
        listView = findViewById(R.id.idMolitveListView);
        textView = findViewById(R.id.id_moltva_cell_textView);
        //listItem = konstante.molitveNazivi;

        listItem = getResources().getStringArray(R.array.spisak_vrlina);

        final ArrayAdapter<String> adpt = new ArrayAdapter<>(this, R.layout.moltva_cell, R.id.id_moltva_cell_textView, listItem);
        listView.setAdapter(adpt);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(NektarijeSpisak.this, NektarijeDetail.class);
                intent.putExtra("nektarije", position);
                startActivity(intent);
            }
        });//setOnItemClickListeners


    }// onCreate()


}// class
