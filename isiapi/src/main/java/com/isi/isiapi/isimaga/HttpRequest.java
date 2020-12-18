package com.isi.isiapi.isimaga;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.isi.isiapi.general.HttpJson;
import com.isi.isiapi.general.classes.MagaProduct;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class HttpRequest {

    private final String apiKey;

    @Deprecated
    public HttpRequest(String serial, String apiKey) {
        this.apiKey = apiKey;
    }


    public HttpRequest(String apiKey) {
        this.apiKey = apiKey;
    }


    public ArrayList<MagaProduct> getProducts(String serial){

        HttpJson json = new HttpJson();
        json.addData("serial", serial);

        MakeHttpPost post = new MakeHttpPost("getProducts", json.getData(), apiKey);

        try {
            String response = post.execute().get();

            return new Gson().fromJson(response, new TypeToken<ArrayList<MagaProduct>>(){}.getType());

        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;

    }

}


