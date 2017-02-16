package pattern.strategy.general;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategy(String input) {
        System.out.println("ConcreteStrategyA" + input);
    }
}
