package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        IDao mysqlDao = new MysqlDao();
        Converter converter = new TxtConverter(mysqlDao);
        String str = converter.converter(1);
        System.out.println("converter result:" + str);

        Converter converter2 = new PdfConverter(mysqlDao);
        String str2 = converter2.converter(2);
        System.out.println("converter result:" + str2);

        IDao pgsqlDao = new PgsqlDao();
        Converter converter3 = new TxtConverter(pgsqlDao);
        String str3 = converter3.converter(3);
        System.out.println("converter result:" + str3);

        Converter converter4 = new PdfConverter(pgsqlDao);
        String str4 = converter4.converter(4);
        System.out.println("converter result:" + str4);
    }
}
