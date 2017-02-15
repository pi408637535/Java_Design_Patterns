package pattern.simple.factory;

/**
 * Created by piguanghua on 2017/2/15.
 */
public class BenzCar implements Car {
    public void driver() {
        System.out.println("BenzCar");
    }

    public String getName() {
        return "BenzCar";
    }
}
