package cn.wilsono.design.patterns.creational.simplefactory;

/**
 * Created by wilson on 2018/5/12.
 */
public class ProductFactory {

    public static Product getProduct(String productClassName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (null == productClassName) {
            throw new RuntimeException("productClassName must not null");
        }

        Class clazz = Class.forName(productClassName);
        Product product = (Product) clazz.newInstance();
        return product;
    }
}
