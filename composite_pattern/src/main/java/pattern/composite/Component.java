package pattern.composite;

/**
 * Created by piguanghua on 2017/2/16.
 */
public abstract class Component {
    protected String name;

    public Component() {
    }

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void Display(int depth);

}
