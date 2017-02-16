package pattern.strategy.simple.factory;

import pattern.strategy.general.ConcreteStrategyA;
import pattern.strategy.general.Strategy;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Context {
    public static void main(String args[]) {
        Strategy strategy = StrategySimpleFactory.createStrategy("strategyA");
        strategy.strategy("hello");
    }
}
