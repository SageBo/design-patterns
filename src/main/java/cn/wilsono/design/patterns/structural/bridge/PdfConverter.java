package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public class PdfConverter extends Converter {

    public PdfConverter(IDao dao) {
        this.dao = dao;
    }

    public String converter(int id) {
        Data data = dao.getData(id);
        System.out.println("converter to PDF format");
        return data.toString();
    }
}
