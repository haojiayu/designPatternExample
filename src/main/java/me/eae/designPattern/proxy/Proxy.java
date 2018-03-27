package com.eae.proxy;

/**
 * Created by 郝家雨 on 2018/3/16.
 * Proxy类，保存了一个引用是的代理可以访问实体，并提供一个与Subject的接口相同的接口，这样就可以代理实体了。
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    public void request() {
        if(realSubject == null){
            new RealSubject();
        }
        realSubject.request();
    }
}
