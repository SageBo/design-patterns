package cn.wilsono.design.patterns.creational.abstractfactory;

/**
 * 抽象工厂，对应的是产品结构，具体工厂类对应的是产品族
 */
public interface ProductFactory {

    Product getProductA();

    Product getProductB();
}
