package cn.wilsono.design.patterns.creational.Singleton;

/**
 * 饿汉式单例
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }


}
