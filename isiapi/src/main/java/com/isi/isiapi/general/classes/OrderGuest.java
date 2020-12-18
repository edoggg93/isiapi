package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class OrderGuest {

    @SerializedName("Id")
    private final int id;
    @SerializedName("Timestamp")
    private final String timestamp;
    @SerializedName("AccountId")
    private final int account_id;
    @SerializedName("TableId")
    private final int table_id;
    @SerializedName("Status")
    private int status;
    @SerializedName("Payment")
    private final int payment;
    @SerializedName("CommercialId")
    private final String commercial_id;
    @SerializedName("Elements")
    private final ArrayList<OrderGuestElement> elements;

    public OrderGuest(int id, String timestamp, int account_id, int table_id, int status, int payment, String commercial_id, ArrayList<OrderGuestElement> elements) {
        this.id = id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.table_id = table_id;
        this.status = status;
        this.payment = payment;
        this.commercial_id = commercial_id;
        this.elements = elements;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<OrderGuestElement> getElements() {
        return elements;
    }

    public int getId() {
        return id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getAccount_id() {
        return account_id;
    }

    public int getTable_id() {
        return table_id;
    }

    public int getStatus() {
        return status;
    }

    public int getPayment() {
        return payment;
    }

    public String getCommercial_id() {
        return commercial_id;
    }
}

class OrderGuestElement{
    @SerializedName("Id")
    private final int id;
    @SerializedName("ProductId")
    private final int product_id;
    @SerializedName("Quantity")
    private final int quantity;
    @SerializedName("OrderId")
    private final int order_id;
    @SerializedName("Name")
    private final String name;
    @SerializedName("Price")
    private final float price;
    @SerializedName("Notes")
    private final ArrayList<NotesOrderGuest> notesOrderGuests;

    public OrderGuestElement(int id, int product_id, int quantity, int order_id, String name, float price, ArrayList<NotesOrderGuest> notesOrderGuests) {
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.order_id = order_id;
        this.name = name;
        this.price = price;
        this.notesOrderGuests = notesOrderGuests;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public ArrayList<NotesOrderGuest> getNotesOrderGuests() {
        return notesOrderGuests;
    }
}

class NotesOrderGuest{
    @SerializedName("Id")
    private final int id;
    @SerializedName("Note_id")
    private final int note_id;
    @SerializedName("Element_id")
    private final int element_id;
    @SerializedName("Name")
    private final String name;
    @SerializedName("Price")
    private final float price;

    public NotesOrderGuest(int id, int note_id, int element_id, String name, float price) {
        this.id = id;
        this.note_id = note_id;
        this.element_id = element_id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getNote_id() {
        return note_id;
    }

    public int getElement_id() {
        return element_id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
