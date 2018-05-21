package cn.wilsono.design.patterns.structural.decorator;

/**
 * 具体实现类
 */
public class CallPhone implements Phone {
    public void feature() {
        System.out.println("can call");
    }
}
