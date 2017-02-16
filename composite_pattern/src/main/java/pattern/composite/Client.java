package pattern.composite;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Client {
    public static void main(String args[]) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite compositeA = new Composite("Composite X");
        compositeA.add(new Leaf("Leaf XA"));
        compositeA.add(new Leaf("Leaf XA"));

        root.add(compositeA);

        Composite compositeY = new Composite("Composite Y");
        compositeA.add(new Leaf("Leaf YA"));
        compositeA.add(new Leaf("Leaf YA"));
        root.add(compositeY);

        root.Display(1);
    }
}
