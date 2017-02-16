package pattern.flyweight;

import javax.jnlp.SingleInstanceListener;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Singleton {
    private static Singleton  singleton = null;

    private Singleton(){
    }

    public static synchronized Singleton getSingleton() {
        if(singleton == null){
            singleton = new Singleton();
            System.out.println("Singleton");
        }
        return singleton;
    }
}
