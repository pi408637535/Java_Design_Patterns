package pattern.adapter;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Forwards extends Player {


    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("Forwards attack");
    }

    @Override
    public void Defense() {
        System.out.println("Forwards defense");
    }
}
