package leet.code;

import org.testng.annotations.Test;

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    //单例1
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

    //2
    public static synchronized Singleton getInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
