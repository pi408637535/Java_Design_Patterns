package pattern.simple.factory.reflect;

import pattern.simple.factory.BMWCar;
import pattern.simple.factory.BenzCar;
import pattern.simple.factory.Car;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class SimpleFactoryReflect {
    public static Car getCar(String carName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        switch (carName){
            case "BenzCar":
                return (BenzCar)(Class.forName("pattern.simple.factory.BenzCar", false, Thread.currentThread().getContextClassLoader()).newInstance());
            case "BMWCar":
                return (BMWCar)(Class.forName("pattern.simple.factory.BMWCar", false, Thread.currentThread().getContextClassLoader()).newInstance());
            default:
                return null;
        }
    }
}
