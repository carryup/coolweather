package com.coolweather.app.util;

/**
 * Created by Joe on 2016/3/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
