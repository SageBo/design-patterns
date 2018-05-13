package cn.wilsono.design.patterns.creational.abstractfactory;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 中国工厂生产的产品族
         */
        ProductFactory cnProductBFactory = new CNProductFactory();
        Product cnProductA = cnProductBFactory.getProductA();
        Product cnProductB = cnProductBFactory.getProductB();

        cnProductA.description();
        cnProductB.description();

        /**
         * 越南工厂生产的产品族
         */
        ProductFactory vieProductBFactory = new VIEProductFactory();
        Product vieProductA = vieProductBFactory.getProductA();
        Product vieProductB = vieProductBFactory.getProductB();

        vieProductA.description();
        vieProductB.description();
    }
}
