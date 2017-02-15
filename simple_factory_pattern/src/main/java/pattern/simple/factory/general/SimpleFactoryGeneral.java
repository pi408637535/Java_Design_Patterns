package pattern.simple.factory.general;

import pattern.simple.factory.BMWCar;
import pattern.simple.factory.BenzCar;
import pattern.simple.factory.Car;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class SimpleFactoryGeneral {
    public static Car getCar(String carName){
        switch (carName){
            case "BenzCar":
                return new BenzCar();
            case "BMWCar":
                return new BMWCar();
            default:
                return null;
        }
    }
}
