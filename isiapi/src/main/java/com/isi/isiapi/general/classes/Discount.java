package com.isi.isiapi.general.classes;

public class Discount {

    private DISCOUNT_TYPE type;
    private float valor;

    public Discount(DISCOUNT_TYPE type, float valor) {
        this.type = type;
        this.valor = valor;
    }

    public DISCOUNT_TYPE getType() {
        return type;
    }

    public float getValor() {
        return valor;
    }

    public enum DISCOUNT_TYPE{
        PERCENT,
        CASH
    }

}
