package pattern.mediator.country;

import pattern.mediator.mediator.UniteNation;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class USA extends Country{
    public USA(UniteNation mediator) {
        super(mediator);
    }

    public void Dealare(String message){
        mediator.Declare(message, this);
    }

    public void GetMessage(String string){
        System.out.println("USA get Message:" + string);
    }
}
