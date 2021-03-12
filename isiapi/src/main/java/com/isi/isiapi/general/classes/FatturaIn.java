package com.isi.isiapi.general.classes;

import com.google.gson.annotations.SerializedName;

public class FatturaIn {

    @SerializedName("id")
    public int id;
    @SerializedName("Billid")
    public int billid;
    @SerializedName("Customer")
    public String customer;
    @SerializedName("RecoverCode")
    public String recoverCode;
    @SerializedName("Datetime")
    public String datetime;
    @SerializedName("Status")
    public int status;
    @SerializedName("FatturaDeleted")
    public int deleted;

}
