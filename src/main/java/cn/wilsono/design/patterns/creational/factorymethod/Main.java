package cn.wilsono.design.patterns.creational.factorymethod;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        ProductFactory productAFactory = new ProductAFactory();
        ProductFactory productBFactory = new ProductBFactory();
        Product productA = productAFactory.getProduct();
        Product productB = productBFactory.getProduct();

        productA.description();
        productB.description();
    }
}
