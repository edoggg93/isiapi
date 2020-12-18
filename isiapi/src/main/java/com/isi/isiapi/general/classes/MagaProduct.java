package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

public class MagaProduct {

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;

    @SerializedName("barcode_value")
    public String barcode_value;

    @SerializedName("storage_categories_id")
    public String storage_categories_id;

    @SerializedName("unity_id")
    public String unity_id;

    @SerializedName("price")
    public float price;

    @SerializedName("quantity")
    public float quantity;

    @SerializedName("blister_pieces")
    public int blister_pieces;

    @SerializedName("forniture_id")
    public Integer forniture_id;

    @SerializedName("commercial_local_id")
    private String commercial_local_id;

    public MagaProduct(String name, String barcode_value, String storage_categories_id, String unity_id, float price, float quantity, Integer forniture_id, int blister_pieces) {
        this.name = name;
        this.barcode_value = barcode_value;
        this.storage_categories_id = storage_categories_id;
        this.unity_id = unity_id;
        this.price = price;
        this.quantity = quantity;
        this.forniture_id = forniture_id;
        this.blister_pieces = blister_pieces;
    }
}

