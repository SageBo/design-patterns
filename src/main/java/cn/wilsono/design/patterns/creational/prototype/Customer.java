package cn.wilsono.design.patterns.creational.prototype;

import java.io.*;

/**
 * Created by wilson on 2018/5/15.
 */
public class Customer implements Serializable {
    private String name;
    private Address address;

    public Customer() {}

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    /**
     * 使用序列化技术实现深克隆
     * 序列化就是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存中。
     * 通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此通过序列化将对
     * 象写到一个流中，再从流里将其读出来，可以实现深克隆。需要注意的是能够实现序列化的对象其类必
     * 须实现Serializable接口，否则无法实现序列化操作。
     */
    public Customer deepClone() throws IOException, ClassNotFoundException {
        // 将对象写到流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 从流中读取对象
        ByteArrayInputStream bas = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bas);
        return  (Customer)ois.readObject();
    }
}
