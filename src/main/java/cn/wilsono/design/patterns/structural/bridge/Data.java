package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public class Data {
    private int id;

    public Data(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                '}';
    }
}
