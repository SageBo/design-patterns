package cn.wilsono.design.patterns.creational.simplefactory;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Product productA = ProductFactory.getProduct("cn.wilsono.design.patterns.creational.simplefactory.ProductA");
        Product productB = ProductFactory.getProduct("cn.wilsono.design.patterns.creational.simplefactory.ProductB");

        productA.description();
        productB.description();
    }
}
