package pattern.adapter;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    public void Attack() {
        System.out.println("Center attack");
    }

    public void Defense() {
        System.out.println("Center defense");
    }
}
