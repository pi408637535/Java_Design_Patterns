package pattern.template.method;

/**
 * Created by piguanghua on 2017/2/17.
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGotoSchoo();;

        Teacher teacher  = new Teacher();
        teacher.prepareGotoSchoo();
    }
}
