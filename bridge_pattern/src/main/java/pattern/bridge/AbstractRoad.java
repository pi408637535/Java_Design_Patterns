package pattern.bridge;

/**
 * Created by piguanghua on 2017/2/17.
 */
public abstract class AbstractRoad {
    protected AbstractCar abstractCar;

    public abstract void Run();

    public void setAbstractCar(AbstractCar abstractCar) {
        this.abstractCar = abstractCar;
    }
}
