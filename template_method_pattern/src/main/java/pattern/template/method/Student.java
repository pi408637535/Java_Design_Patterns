package pattern.template.method;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class Student extends AbstractPerson {
    public void dressUp() {
        System.out.println("穿校服");
    }

    public void eatBreakfast() {
        System.out.println("吃妈妈做好的早饭");
    }

    public void takeThings() {
        System.out.println("背书包，带上家庭作业和红领巾");
    }
}
