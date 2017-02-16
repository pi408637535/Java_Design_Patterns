package pattern.composite;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    public void add(Component component) {
        System.out.println("add leaf");
    }

    public void remove(Component component) {
        System.out.println("remove leaf");
    }

    public void Display(int depth) {
        System.out.println("-" + depth + " "  + name);
    }
}
