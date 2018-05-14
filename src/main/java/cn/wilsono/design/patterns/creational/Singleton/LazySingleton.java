package cn.wilsono.design.patterns.creational.Singleton;

/**
 * 懒汉式单例
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            return new LazySingleton();
        }
        return instance;
    }

}
