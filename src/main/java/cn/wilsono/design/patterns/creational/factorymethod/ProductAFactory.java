package cn.wilsono.design.patterns.creational.factorymethod;

/**
 * Created by wilson on 2018/5/12.
 */
public class ProductAFactory implements ProductFactory {

    public Product getProduct() {
        return new ProductA();
    }
}
