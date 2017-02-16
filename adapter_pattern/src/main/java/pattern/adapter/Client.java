package pattern.adapter;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class Client {
    public static void main(String args[]) {
        Player player = new Center("Nike");
        player.Attack();

        Player adapter = new Adapter("Yaoming");
        adapter.Attack();
    }
}
