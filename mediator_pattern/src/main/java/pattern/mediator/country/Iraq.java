package pattern.mediator.country;

import pattern.mediator.mediator.UniteNation;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class Iraq extends Country {
    public Iraq(UniteNation mediator) {
        super(mediator);
    }

    public void Dealare(String message){
        mediator.Declare(message, this);
    }

    public void GetMessage(String string){
        System.out.println("Iraq get Message:" + string);
    }
}
