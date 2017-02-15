package pattern.simple.factory.general;

import pattern.simple.factory.Car;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class Client {
    public static void main(String args[]) {
        Car car = SimpleFactoryGeneral.getCar("BenzCar");
        car.driver();
    }
}
