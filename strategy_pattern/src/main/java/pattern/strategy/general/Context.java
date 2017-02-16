package pattern.strategy.general;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Context {
    public static void main(String args[]) {
        Strategy strategy = new ConcreteStrategyA();
        strategy.strategy("hello");
    }
}
