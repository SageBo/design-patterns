package cn.wilsono.design.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wilson on 2018/5/21.
 */
public class DynamicSubjectProxy implements InvocationHandler {
    private Subject subject;

    public DynamicSubjectProxy(Subject subject) {
        this.subject = subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before " + method.getName());
        Object rt = method.invoke(subject, args);
        System.out.println("after " + method.getName());

        return rt;
    }
}
