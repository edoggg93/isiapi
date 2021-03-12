package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Fattura {

    @SerializedName("Id")
    public int id;
    @SerializedName("Arrival")
    public String arrival;
    @SerializedName("Payed")
    public boolean payed;
    @SerializedName("Color")
    public int color;
    @SerializedName("Master")
    public int master;
    @SerializedName("ElementBills")
    public ArrayList<ElementData> elements;
    @SerializedName("Fattures")
    public ArrayList<FatturaIn> fattures;
}
