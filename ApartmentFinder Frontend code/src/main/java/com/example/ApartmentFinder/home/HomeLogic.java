package com.example.ApartmentFinder.home;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.ApartmentFinder.Volley.IJSONArrayRequest;
import com.example.ApartmentFinder.app.Apartment;
import com.example.ApartmentFinder.app.AppController;
import com.example.ApartmentFinder.net_utils.Const;
import com.example.ApartmentFinder.Volley.IView;
import com.example.ApartmentFinder.Volley.IVolleyListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class HomeLogic implements IVolleyListener{
    IView r;
    IJSONArrayRequest arrayRequest;
    private String TAG = HomeLogic.class.getSimpleName();
    ServerCallback callback;
    ArrayList<Apartment> allApartments = new ArrayList<>();
    boolean requestFinished;

    public HomeLogic(final ServerCallback callback){
        requestFinished = false;
        this.callback = callback;
    }

    public void getAllApartments(boolean filter, JSONObject parameters){
        //GETJsonArrayRequest(Const.URL_JSON_OBJECT+ "/Apartments", filter, parameters);
        arrayRequest.sendToServer(Const.postmanURL+ "/Apartments", filter, parameters);
    }

    public void onSuccess(String password){
        if(password.length()>0){
            r.showText("You are registered!");
        }else{
            r.showText("Error with request, please try again.");
        }
    }

    @Override
    public void onError(String s) {

    }

}
