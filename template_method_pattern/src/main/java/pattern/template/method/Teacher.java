package pattern.template.method;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class Teacher extends AbstractPerson{
    public void dressUp() {
        System.out.println("穿工作服");
    }

    public void eatBreakfast() {
        System.out.println("做早饭，照顾孩子吃早饭");
    }

    public void takeThings() {
        System.out.println("带上昨晚准备的考卷");
    }
}
