package cn.wilsono.design.patterns.structural.bridge;

/**
 * Created by wilson on 2018/5/17.
 */
public abstract class Conver {

    protected IDao dao;

    abstract String conver(int id);
}
