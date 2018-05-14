package cn.wilsono.design.patterns.creational.prototype;

/**
 * Created by wilson on 2018/5/15.
 */
public class Engine implements Cloneable {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
