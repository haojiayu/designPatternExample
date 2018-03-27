package me.eae.designPattern.proxy;

/**
 * Created by 郝家雨 on 2018/3/16.
 */

/**
 * subject类，定义了RealSubject和Proxy的共同接口，这样就在任何地方使用RealSubject的地方使用Proxy
 */
public interface Subject {
    public abstract void request();
}
