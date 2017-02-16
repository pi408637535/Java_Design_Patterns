package pattern.iterator;

/**
 * Created by piguanghua on 2017/2/16.
 */
public interface Iterator <T>{
    T getFirst();
    T getNext(int site);
    boolean isDone();
    T getCurrentItem();
}
