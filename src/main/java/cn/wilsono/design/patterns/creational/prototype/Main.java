package cn.wilsono.design.patterns.creational.prototype;

import cn.wilsono.design.patterns.creational.simplefactory.Product;
import cn.wilsono.design.patterns.creational.simplefactory.ProductFactory;

import java.io.IOException;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Customer customer1 = new Customer("Jack", new Address("hank road"));
        Customer customer2 = customer1.deepClone();

        System.out.println("客户1 " + customer1.toString());
        System.out.println("客户2 " + customer2.toString());

        System.out.println("客户是否相同？ " + (customer1 ==  customer2));
        System.out.println("地址是否相同？ " +  (customer1.getAddress() == customer2.getAddress()));

    }
}
