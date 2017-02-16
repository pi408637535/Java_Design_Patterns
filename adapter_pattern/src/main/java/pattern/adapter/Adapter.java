package pattern.adapter;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Adapter extends Player {

    private ForeignCenter foreignCenter;

    public Adapter(String name) {
        super(name);
        foreignCenter = new ForeignCenter(name);
    }

    public void Attack() {
        foreignCenter.jingong();
    }

    public void Defense() {
        foreignCenter.fangshou();
    }
}
