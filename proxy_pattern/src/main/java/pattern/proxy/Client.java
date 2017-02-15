package pattern.proxy;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class Client {
    private static ISubject iSubject;

    public static void main(String args[]) {
        iSubject = new SubjectProxy();
        iSubject.action();
    }
}
