package com.interfacemockup.kalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ObicajiDetail extends AppCompatActivity {

    private int _selektor;
    private TextView _naslov;
    private  TextView _obicaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obicaji_detail);
        _naslov = findViewById(R.id.id_naslov_obicaja);
        _obicaj = findViewById(R.id.id_obicaj_text_detail);
        _obicaj.setMovementMethod(new ScrollingMovementMethod());


        Intent intent = getIntent();
        _selektor = intent.getIntExtra("obicaj", 0);

        String naslov = getResources().getStringArray(R.array.spisak_obicaja)[_selektor];
        String obicaj = getResources().getStringArray(R.array.detail_obicaja)[_selektor];

        _naslov.setText(naslov);
        _obicaj.setText(obicaj);

    }
}
