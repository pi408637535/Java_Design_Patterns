package pattern.proxy;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class SubjectProxy implements ISubject{
    private ConcreateSubject concreateSubject;

    public void preAction(){
        System.out.println("preAction");
    }

    public void postAction(){
        System.out.println("postAction");
    }

    public SubjectProxy() {
        this.concreateSubject = new ConcreateSubject();
    }

    public void action() {
        this.preAction();
        concreateSubject.action();
        this.postAction();
    }
}
