package cn.wilsono.design.patterns.creational.prototype;

/**
 * Created by wilson on 2018/5/15.
 */
public class Car implements Cloneable {
    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * 注意的是能够实现克隆的Java类必须实现一个标识接口Cloneable，表示这个Java类支持被复制。
     * 如果一个类没有实现这个接口但是调用了clone()方法，Java编译器将抛出一个CloneNotSupportedException异常
     */
    public Car clone() {
        try {
            return (Car)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
