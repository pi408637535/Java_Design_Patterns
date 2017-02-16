package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class IntegerIterator<Integer>  implements Iterator<Integer>{

    private List<Integer> iteratorList = new ArrayList<>();

    @Override
    public Integer getFirst() {
        return iteratorList.get(0);
    }

    @Override
    public Integer getNext(int site) {
        return iteratorList.get(site);
    }

    @Override
    public boolean isDone() {
        return iteratorList.size() > 0 ? true : false;
    }

    @Override
    public Integer getCurrentItem() {
        return iteratorList.get(0);
    }
}
