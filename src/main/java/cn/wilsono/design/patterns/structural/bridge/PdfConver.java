package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public class PdfConver extends Conver {

    public PdfConver(IDao dao) {
        this.dao = dao;
    }

    public String conver(int id) {
        Data data = dao.getData(id);
        System.out.println("conver to PDF format");
        return data.toString();
    }
}
