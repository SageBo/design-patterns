package cn.wilsono.design.patterns.structural.proxy;

/**
 * Created by wilson on 2018/5/21.
 */
public class RealSubject implements Subject {
    public void sendMsg() {
        System.out.println("send sms ...");
    }

    public void call() {
        System.out.println("make a call ...");
    }
}
