package com.interfacemockup.kalendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomArrayAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> listaSvetaca = new ArrayList<>();

    public MyCustomArrayAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
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
        v = inflater.inflate(R.layout.dan_cell, null);
        TextView textView = (TextView) v.findViewById(R.id.id_ime_svetitelja);
        ImageView imageView = (ImageView) v.findViewById(R.id.id_ikona_svetitelja);
        TextView datumText = (TextView) v.findViewById(R.id.id_datum);
        textView.setText(listaSvetaca.get(position).getSvetacName());
        imageView.setImageResource(listaSvetaca.get(position).getSvetacImage());
        datumText.setText(listaSvetaca.get(position).getdatum());
        return v;

    }
}
