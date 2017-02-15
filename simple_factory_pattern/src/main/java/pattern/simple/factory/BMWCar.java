package pattern.simple.factory;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class BMWCar implements Car {

    public void driver() {
        System.out.println("BMWCar");
    }

    public String getName() {
        return "BMWCar";
    }
}
