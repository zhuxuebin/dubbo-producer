package com.dubbo.service;

/**
 * Created by 01368080 on 2017/5/26.
 */
public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}
