package pattern.proxy;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class ConcreateSubject implements ISubject {

    public void action() {
        System.out.println("ConcreateSubject");
    }
}
