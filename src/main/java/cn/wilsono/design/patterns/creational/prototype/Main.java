package cn.wilsono.design.patterns.creational.prototype;

import cn.wilsono.design.patterns.creational.simplefactory.Product;
import cn.wilsono.design.patterns.creational.simplefactory.ProductFactory;

import java.io.IOException;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 浅拷贝
        Car car1 = new Car("Amazing car", new Engine("Crazy engine"));
        Car car2 = car1.clone();

        System.out.println("car1 " + car1.toString());
        System.out.println("car2 " + car2.toString());

        System.out.println("Car是否相同？ " + (car1 ==  car2));
        System.out.println("Engine是否相同？ " +  (car1.getEngine() == car2.getEngine()));

        // 深拷贝
        Customer customer1 = new Customer("Jack", new Address("hank road"));
        Customer customer2 = customer1.deepClone();

        System.out.println("客户1 " + customer1.toString());
        System.out.println("客户2 " + customer2.toString());

        System.out.println("客户是否相同？ " + (customer1 ==  customer2));
        System.out.println("地址是否相同？ " +  (customer1.getAddress() == customer2.getAddress()));

    }
}
