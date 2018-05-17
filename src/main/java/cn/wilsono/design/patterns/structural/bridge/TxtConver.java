package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public class TxtConver extends Conver {
    public TxtConver(IDao dao) {
        this.dao = dao;
    }

    public String conver(int id) {
        Data data = dao.getData(id);
        System.out.println("conver to txt format");
        return data.toString();
    }
}
