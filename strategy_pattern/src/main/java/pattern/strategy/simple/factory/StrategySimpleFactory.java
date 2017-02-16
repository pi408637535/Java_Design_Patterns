package pattern.strategy.simple.factory;

import pattern.strategy.general.ConcreteStrategyA;
import pattern.strategy.general.ConcreteStrategyB;
import pattern.strategy.general.Strategy;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class StrategySimpleFactory {
    public static Strategy createStrategy(String strategyName){
        switch (strategyName){
            case "strategyA":
                return new ConcreteStrategyA();
            case "strategyB":
                return new ConcreteStrategyB();
            default:
                return null;
        }
    }
}
