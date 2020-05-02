package com.interfacemockup.kalendar;

import android.graphics.Color;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class KatihizisDva extends AppCompatActivity {

    private ListView listView;// List View gore pomenut pod brojem 1.
    private TextView textView;// TextView iz Cella iz drugog ffajla
    private String[] listItem;// Arraj koji ce biti predstavljen u tom ListViewu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katihizis_dva);

        listView = findViewById(R.id.id_katihizis_pitanja);
        textView = findViewById(R.id.id_katihizis_cell_textView);
        listItem = getResources().getStringArray(R.array.katehizis_pitanja);
                                                                               //cell.xml ffile    //id text viewa iz cell.xml file //resource ffile
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.katihizis_cell, R.id.id_katihizis_cell_textView, listItem);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(KatihizisDva.this, KatihizisDetail.class);
                intent.putExtra("pitanje", position);
                startActivityForResult(intent, 1);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                int rezultat = data.getIntExtra("ppp", 0);
                listView.smoothScrollToPosition(rezultat);
            }
        }
    }



    public void nazad_na_main(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
