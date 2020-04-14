package com.interfacemockup.kalendar;

public class Item2 {
    String _post;
    String _svetac;
    String _datum;
    int _ikona;

    public Item2(String post, String svetacName, int svetacImage, String datum )
    {
        this._post = post;
        this._ikona = svetacImage;
        this._svetac = svetacName;
        this._datum = datum;
    }

    public String getPost(){return _post;}

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
