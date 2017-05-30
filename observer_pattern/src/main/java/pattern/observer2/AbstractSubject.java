package pattern.observer2;

/**
 * Created by piguanghua on 2017/5/30.
 */
public interface AbstractSubject {
    void registerObserver(AbstractObserver abstractObserver);
    void notifyObserver(String tweet);
}
