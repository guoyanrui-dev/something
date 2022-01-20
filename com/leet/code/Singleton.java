package leet.code;

/**
 * @author guoyanrui on 2022/1/20
 */
public class Singleton {
    /*综合了懒汉式和饿汉式两者的优缺点整合而成
    特点是在synchronized关键字内外都加了一层 if 条件判断，这样既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间。
    * */
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
