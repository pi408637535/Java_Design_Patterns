package pattern.chain.responsibility;

/**
 * Created by piguanghua on 2017/2/16.
 */
public abstract class Handler {
    protected Handler successor;

    public  void setSuccessor(Handler handler){ //设置继任者
        this.successor = handler;
    }

    public abstract void HandleRequest(int request);
}
