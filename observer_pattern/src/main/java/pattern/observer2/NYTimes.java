package pattern.observer2;

/**
 * Created by piguanghua on 2017/5/30.
 */
public class NYTimes implements AbstractObserver {
    public void notify(String tweet) {
        if(tweet !=null && tweet.contains("money")){
            System.out.println(tweet);
        }
    }
}
