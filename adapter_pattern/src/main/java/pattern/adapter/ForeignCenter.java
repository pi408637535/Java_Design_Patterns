package pattern.adapter;

/**
 * Created by piguanghua on 2017/2/16.
 */
public class ForeignCenter {

    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void jingong(){
        System.out.println("ForeignCenter jingong");
    }

    public void fangshou(){
        System.out.println("ForeignCenter fangshou");
    }
}
