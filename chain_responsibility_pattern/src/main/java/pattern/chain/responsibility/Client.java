package pattern.chain.responsibility;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Client {
    public static void main(String args[]) {
        Handler handlerOne = new ConcreateHandlerOne();
        Handler handlerTwo = new ConcreateHandlerTwo();
        handlerOne.setSuccessor(handlerTwo);

        int [] requests = {1,2,3,4,54,6,8,56,7,23,12};

        for(int request: requests){
            handlerOne.HandleRequest(request);
        }
    }
}
