package cn.wilsono.design.patterns.creational.abstractfactory;

/**
 * 越南工厂
 */
public class VIEProductFactory implements ProductFactory {

    public Product getProductA() {
        return new VIEProductA();
    }

    public Product getProductB() {
        return new VIEProductB();
    }
}
