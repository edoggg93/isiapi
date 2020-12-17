package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

public class BillProduct {
    @SerializedName("quantity")
    private int quantity = 1;
    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private float price;
    @SerializedName("discount")
    private Discount discount = null;
    @SerializedName("rep")
    private int rep;

    public BillProduct(String name, float price, int rep) {
        this.name = name;
        this.price = price;
        this.rep = rep;
    }

    public int getCode() {
        return this.rep;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return this.discount;
    }
}