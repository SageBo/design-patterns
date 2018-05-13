package cn.wilsono.design.patterns.creational.abstractfactory;

/**
 * 中国工厂
 */
public class CNProductFactory implements ProductFactory {

    public Product getProductA() {
        return new CNProductA();
    }

    public Product getProductB() {
        return new CNProductB();
    }
}
