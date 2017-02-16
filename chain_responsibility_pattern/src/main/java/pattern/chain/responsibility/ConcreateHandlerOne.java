package pattern.chain.responsibility;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class ConcreateHandlerOne extends  Handler {

    @Override
    public void HandleRequest(int request) {
        if(request > 0 && request < 5){
            System.out.println("request range is between 0 and 5");
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
