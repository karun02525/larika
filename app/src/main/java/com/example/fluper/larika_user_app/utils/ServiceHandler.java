/*
package com.example.fluper_pc.larikauser.utils;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

 public class ServiceHandler {

    static String response = null;
    public final static int GET = 1;
    public final static int POST = 2;

    public ServiceHandler() {
    }

    public String makeServiceCall(String url, int method, ArrayList<com.koushikdutta.async.http.NameValuePair> params) {

        try {
            DefaultHttpClient httpclient = new DefaultHttpClient();
            HttpEntity httpentity = null;
            HttpResponse httpresponse = null;
            if (method == POST) {
                //System.out.println("request :"+params);
                //System.out.println("post_url :"+url);
                HttpPost httpPost = new HttpPost(url);
                if (params != null) {
                    httpPost.setEntity(new UrlEncodedFormEntity((List<? extends NameValuePair>) params));
                }
                httpresponse = httpclient.execute(httpPost);
            } else if (method == GET) {
                // appending params to url
                if (params != null && !params.isEmpty()) {
                    String paramString = URLEncodedUtils
                            .format((List<? extends NameValuePair>) params, "utf-8");
                    url += "?" + paramString;
                }
                HttpGet httpGet = new HttpGet(url);
                httpresponse = httpclient.execute(httpGet);
            }
            httpentity = httpresponse.getEntity();

            response = EntityUtils.toString(httpentity);
            Log.d("response :", response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}*/
