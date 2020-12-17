package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("Id")
    public int id;

    @SerializedName("Name")
    public String name;

    @SerializedName("Color")
    public Integer color;

    public Category(int id, String name, Integer color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
