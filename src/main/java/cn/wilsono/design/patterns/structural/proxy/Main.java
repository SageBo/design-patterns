package cn.wilsono.design.patterns.structural.proxy;

import cn.wilsono.design.patterns.structural.decorator.CallPhone;
import cn.wilsono.design.patterns.structural.decorator.Phone;
import cn.wilsono.design.patterns.structural.decorator.SmsPhoneDecorator;

import java.lang.reflect.Proxy;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        Subject subject = new RealSubject();
        subject.sendMsg();
        subject.call();

        System.out.println("======== use proxy =======");
        Subject subjectProxy = new SubjectProxy(subject);
        subjectProxy.sendMsg();
        subjectProxy.call();

        System.out.println("======== use dynamic proxy =======");

        /**
         * 3个参数
         * loader - 定义代理类的类加载器
         * interfaces - 代理类要实现的接口列表
         * h - 指派方法调用的调用处理程序
         * return 返回动态生成的代理类实例
         */
        Subject dynamicSubjectProxy = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), new DynamicSubjectProxy(subject));

        dynamicSubjectProxy.sendMsg();
        dynamicSubjectProxy.call();
    }
}
