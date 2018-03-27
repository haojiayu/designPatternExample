package com.eae.proxy;

/**
 * Created by 郝家雨 on 2018/3/16.
 */
public class RealSubject implements Subject {

    public void request() {
        System.out.println("真实的请求");
    }
}
