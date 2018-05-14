package cn.wilsono.design.patterns.creational.prototype;

import java.io.Serializable;

/**
 * Created by wilson on 2018/5/15.
 */
public class Address implements Serializable {
    private String address;

    public Address() {}

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
