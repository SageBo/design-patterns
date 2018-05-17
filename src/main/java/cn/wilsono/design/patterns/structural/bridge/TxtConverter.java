package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public class TxtConverter extends Converter {
    public TxtConverter(IDao dao) {
        this.dao = dao;
    }

    public String converter(int id) {
        Data data = dao.getData(id);
        System.out.println("converter to txt format");
        return data.toString();
    }
}
