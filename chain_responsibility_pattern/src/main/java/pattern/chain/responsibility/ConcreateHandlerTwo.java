package pattern.chain.responsibility;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class ConcreateHandlerTwo extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request > 10 && request < 15){
            System.out.println("request range is between 10 and 15");
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
