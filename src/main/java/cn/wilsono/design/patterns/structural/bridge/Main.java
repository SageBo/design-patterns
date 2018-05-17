package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/12.
 */
public class Main {

    public static void main(String[] args) {

        IDao dao = new MysqlDao();
        Conver conver = new TxtConver(dao);
        String str = conver.conver(1);
        System.out.println("conver result:" + str);

    }
}
