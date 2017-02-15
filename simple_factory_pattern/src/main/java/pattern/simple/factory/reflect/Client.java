package pattern.simple.factory.reflect;

import pattern.simple.factory.Car;
import pattern.simple.factory.general.SimpleFactoryGeneral;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class Client {
    public static void main(String args[]) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Car car = SimpleFactoryReflect.getCar("BenzCar");
        car.driver();
    }
}
