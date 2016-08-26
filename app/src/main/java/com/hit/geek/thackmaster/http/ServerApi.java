package com.hit.geek.thackmaster.http;

import android.util.Log;

import com.hit.geek.thackmaster.define.MarkerBean;
import com.hit.geek.thackmaster.utils.HttpsUtils;

import org.xutils.common.Callback;

/**
 * Created by eason on 8/26/16.
 */
public class ServerApi {
    public static String host = "http://123.206.220.49:8080";

    public static void GetHotels(){
        HttpsUtils.Get("/api/hotel", null, new Callback.CommonCallback<MarkerBean>(){

            @Override
            public void onCancelled(CancelledException arg0) {}

            @Override
            public void onError(Throwable ex, boolean isCheck) {
                Log.i("error","json lost");
            }

            @Override
            public void onFinished() {
            }

            @Override
            public void onSuccess(MarkerBean result) {
                // TODO Auto-generated method stub
            }

        });
    }
}