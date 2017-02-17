package pattern.template.method;

/**
 * Created by piguanghua on 2017/2/17.
 */
public abstract class AbstractPerson {
    public void prepareGotoSchoo(){
        dressUp();
        eatBreakfast();
        takeThings();
    }
    public abstract void dressUp();
    public abstract void eatBreakfast();
    public abstract void takeThings();

}
