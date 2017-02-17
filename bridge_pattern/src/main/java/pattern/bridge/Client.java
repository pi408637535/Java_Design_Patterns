package pattern.bridge;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class Client {
    public static void main(String args[]) {
        SpeedWay speedWay = new SpeedWay();
        Bus bus = new Bus();
        speedWay.setAbstractCar(bus);
        speedWay.Run();
    }
}
