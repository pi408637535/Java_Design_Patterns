package pattern.observer.subject;

import pattern.observer.observe.AbstractOberver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piguanghua on 2017/2/16.
 */
public abstract class AbstractSubject {
    protected List<AbstractOberver> list = new ArrayList<AbstractOberver>();

    public void Attach(AbstractOberver abstractOberver){
        list.add(abstractOberver);
    }

    public void Detach(AbstractOberver abstractOberver){
        for(AbstractOberver oberver : list){
            if(abstractOberver == oberver){
                list.remove(abstractOberver);
            }
        }
    }

    public void notiry(){
        for(AbstractOberver oberver : list){
            oberver.Update();
        }
    }
}
