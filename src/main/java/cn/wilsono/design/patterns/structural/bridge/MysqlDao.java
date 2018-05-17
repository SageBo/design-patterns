package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public class MysqlDao implements IDao {
    public Data getData(int id) {
        System.out.println("get data from mysql");
        return new Data(id);
    }
}
