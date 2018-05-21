package cn.wilsono.design.patterns.structural.proxy;

/**
 * Created by wilson on 2018/5/21.
 */
public class SubjectProxy implements Subject {
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    public void sendMsg() {
        System.out.println("before send sms");
        subject.sendMsg();
        System.out.println("after send sms");
    }

    public void call() {
        System.out.println("before make a call");
        subject.call();
        System.out.println("after make a call");
    }
}
