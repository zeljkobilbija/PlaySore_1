package com.interfacemockup.kalendar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.interfacemockup.kalendar.pravoslavnekalkulacije.PravoslavneKonstante;

public class Molitve extends AppCompatActivity {

    private ListView listView;// List View gore pomenut pod brojem 1.
    private TextView textView;// TextView iz Cella iz drugog ffajla
    private String[] listItem;// Arraj koji ce biti predstavljen u tom ListViewu
    private PravoslavneKonstante konstante;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molitve);

        konstante = new PravoslavneKonstante();

        listView = findViewById(R.id.idMolitveListView);
        textView = findViewById(R.id.id_moltva_cell_textView);
        //listItem = konstante.molitveNazivi;

        listItem = getResources().getStringArray(R.array.molitve);

        final ArrayAdapter<String> adpt = new ArrayAdapter<>(this, R.layout.moltva_cell, R.id.id_moltva_cell_textView, listItem);
        listView.setAdapter(adpt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(Molitve.this, MoltvaDetail.class);
                intent.putExtra("molitva", position);
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                int rez = data.getIntExtra("molitva", 0);
                listView.smoothScrollToPosition(rez);
            }
        }
    }

    public void nazad_sa_molitvi(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
