package cn.wilsono.design.patterns.creational.Singleton;

/**
 * Double-Checked 单例模式
 */
public class DoubleCheckedLazySingleton {
    /**
     * volatile 保证instance的可见性，但被volatile修饰的成员变量可以确保多个线程都能够正确处理，
     * 且该代码只能在JDK 1.5及以上版本中才能正确执行。由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，
     * 可能会导致系统运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
     */
    private static volatile DoubleCheckedLazySingleton instance = null;

    private DoubleCheckedLazySingleton() {}

    /**
     * 假如在某一瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，
     * 均能通过instance == null的判断。由于实现了synchronized加锁机制，
     * 线程A进入synchronized锁定的代码中执行实例创建代码，线程B处于排队等待状态，
     * 必须等待线程A执行完毕后才可以进入synchronized锁定代码。但当A执行完毕时，
     * 线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，违背单例模式的设计思想，
     * 因此需要进行进一步改进，在synchronized中再进行一次(instance == null)判断，
     * 这种方式称为双重检查锁定(Double-Check Locking)。
     */
    public static DoubleCheckedLazySingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckedLazySingleton.class) {
                if (null == instance) {
                    return new DoubleCheckedLazySingleton();
                }
            }
        }
        return instance;
    }
}
