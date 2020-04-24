package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Obicaji extends AppCompatActivity {


    private ListView listView;// List View gore pomenut pod brojem 1.
    private TextView textView;// TextView iz Cella iz drugog ffajla
    private String[] listItem;// Arraj koji ce biti predstavljen u tom ListViewu


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obicaji);

        listView = findViewById(R.id.id_obicaji);
        textView = findViewById(R.id.id_katihizis_cell_textView);
        listItem = getResources().getStringArray(R.array.spisak_obicaja);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.katihizis_cell, R.id.id_katihizis_cell_textView, listItem);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //TODO:
                Intent intent = new Intent(Obicaji.this, ObicajiDetail.class);
                intent.putExtra("obicaj", position);
                startActivity(intent);
                //startActivityForResult(intent, 1);
            }
        });



    }
}
