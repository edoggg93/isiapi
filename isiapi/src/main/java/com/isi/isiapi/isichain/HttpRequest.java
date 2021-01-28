package com.isi.isiapi.isichain;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.isi.isiapi.general.HttpJson;
import com.isi.isiapi.general.classes.Forniture;
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


    public ArrayList<Forniture> getForniture(String serial){

        HttpJson json = new HttpJson();
        json.addData("serial", serial);

        MakeHttpPost post = new MakeHttpPost("getForniture", json.getData(), apiKey);

        try {
            String response = post.execute().get();

            Log.e("TAG", "getForniture: " + response);

            return new Gson().fromJson(response, new TypeToken<ArrayList<Forniture>>(){}.getType());

        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;

    }

}


