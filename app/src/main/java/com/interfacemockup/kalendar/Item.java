package com.interfacemockup.kalendar;

public class Item {

    String _svetac;
    String _datum;
    int _ikona;

    public Item(String svetacName, int svetacImage, String datum )
    {
        this._ikona = svetacImage;
        this._svetac = svetacName;
        this._datum = datum;
    }


    public String getSvetacName()
    {
        return _svetac;
    }
    public String getdatum() {return _datum;}
    public int getSvetacImage()
    {
        return _ikona;
    }
}
