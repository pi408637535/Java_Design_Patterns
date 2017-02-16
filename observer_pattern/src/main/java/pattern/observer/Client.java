package pattern.observer;

import pattern.observer.observe.AbstractOberver;
import pattern.observer.observe.LeaderOberver;
import pattern.observer.observe.WorkerOberver;
import pattern.observer.subject.SecretarySubject;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Client {
    public static void main(String args[]) {
        AbstractOberver worker = new WorkerOberver();
        AbstractOberver leader = new LeaderOberver();

        SecretarySubject secretarySubject = new SecretarySubject();

        secretarySubject.Attach(worker);
        secretarySubject.Attach(leader);

        secretarySubject.notiry();
    }
}
