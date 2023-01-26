package hellojava.basic;


/**
 * An implementation of double checked locking of Singleton.
 *
 * Intention is to minimize cost of synchronization and improve performance, by only locking critical section of code,
 * the code which creates instance of Singleton class.
 *
 * By the way this is still broken, if we don't make _instance volatile,
 * as another thread can see a half initialized instance of Singleton.
 * 
 */
public class HelloSingleton {
    private volatile static HelloSingleton _instance;

    private HelloSingleton() {
    }

    public static HelloSingleton getInstanceDC() {
        if (_instance == null) {
            synchronized (HelloSingleton.class) {
                if (_instance == null) {
                    _instance = new HelloSingleton();
                }
            }
        }
        return _instance;
    }
}
