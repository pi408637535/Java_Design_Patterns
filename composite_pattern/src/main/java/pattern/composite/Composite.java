package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Composite extends Component{

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        for(Component temp : children){
            if(children == temp){
                children.remove(temp);
            }
        }
    }

    public void Display(int depth) {
        System.out.println("-" + depth + " "  + name);

        for(Component component : children){
            component.Display(depth + 2);
        }
    }
}
