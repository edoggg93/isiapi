package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

public class ElementData{

    @SerializedName("Id")
    public int id;
    @SerializedName("ProductId")
    public int productId;
    @SerializedName("Name")
    public String name;
    @SerializedName("Price")
    public float price;
    @SerializedName("SubCode")
    public int SubCode;
    @SerializedName("Delivered")
    public boolean delivered;


}
