package decorate.proxy;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class SubjectDecorator implements ISubject{
    private ISubject iSubject;

    public void preAction(){
        System.out.println("preAction");
    }

    public void postAction(){
        System.out.println("postAction");
    }

    public SubjectDecorator(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    public void action() {
        this.preAction();
        iSubject.action();
        this.postAction();
    }
}
