package com.interfacemockup.kalendar;

public class GlobalnaClassa {

    private boolean _pokaziAdMob;


    private static final GlobalnaClassa instance = new GlobalnaClassa();

    public static GlobalnaClassa getInstance(){
        return instance;
    }

    private GlobalnaClassa(){ }


    public void setPokaziAdMob(boolean adJeVidljiv){
        this._pokaziAdMob = adJeVidljiv;
    }

    public boolean getPokaziAdMob(){
        return _pokaziAdMob;
    }

}
