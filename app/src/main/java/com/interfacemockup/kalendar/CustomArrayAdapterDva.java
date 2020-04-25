package com.interfacemockup.kalendar;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


public class CustomArrayAdapterDva extends ArrayAdapter<Item2> {
    ArrayList<Item2> listaSvetaca = new ArrayList<>();


    public CustomArrayAdapterDva(Context context, int textViewResourceId, ArrayList<Item2> objects) {
        super(context, textViewResourceId, objects);
        listaSvetaca = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.dan_dan_cell, null);
        TextView postLabel = v.findViewById(R.id.id_post_label);
        TextView textView = v.findViewById(R.id.id_svetitelj_dnevni);
        ImageView imageView = v.findViewById(R.id.id_ikona_dnevna);
        TextView datumText = v.findViewById(R.id.id_datum_label);
        postLabel.setText(listaSvetaca.get(position).getPost());
        textView.setText(listaSvetaca.get(position).getSvetacName());
        imageView.setImageResource(listaSvetaca.get(position).getSvetacImage());
        datumText.setText(listaSvetaca.get(position).getdatum());
        return v;

    }



}
