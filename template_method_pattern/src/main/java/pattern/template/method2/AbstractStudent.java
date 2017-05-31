package pattern.template.method2;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * Created by piguanghua on 2017/5/31.
 */
abstract public class AbstractStudent {
    abstract protected void doBefore();
    abstract protected void doAfter();

    protected void doHomeWork(UnaryOperator<String> unaryOperator){
        doBefore();
        System.out.println(unaryOperator.apply("doHomeWord").toLowerCase());
        doAfter();
   }

}
