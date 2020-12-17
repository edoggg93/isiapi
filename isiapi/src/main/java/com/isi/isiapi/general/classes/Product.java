package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("Id")
    public int id;

    @SerializedName("Name")
    public String name;

    @SerializedName("Price")
    public float price;

    @SerializedName("DepartmentId")
    public int department_id;

    @SerializedName("BarcodeValue")
    public String barcode;

    @SerializedName("Color")
    public Integer color;

    @SerializedName("CategoryId")
    public int category_id = 0;


    public Product(int id, String name, float price, int department_id, String barcode, Integer color, int category_id) {
        this.name = name;
        this.price = price;
        this.department_id = department_id;
        this.barcode = barcode;
        this.color = color;
        this.category_id = category_id;
        this.id = id;
    }


}
