package pattern.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piguanghua on 2017/5/30.
 */
public class ConcreateSubject implements AbstractSubject{

    List<AbstractObserver> abstractObserverList = new ArrayList<>();

    @Override
    public void registerObserver(AbstractObserver abstractObserver) {
        abstractObserverList.add(abstractObserver);
    }

    @Override
    public void notifyObserver(final String tweet) {
            abstractObserverList.forEach(
                    (observer)->{
                        observer.notify(tweet);
                    }
            );
    }
}
