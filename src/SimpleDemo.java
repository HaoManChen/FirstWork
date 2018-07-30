import strategy.impl.OperationAdd;
import strategy.impl.OperationMultiply;
import strategy.impl.OperationSubstract;

/**
 * @author haoman
 * @Date 2018/7/30 上午10:06
 */
public class SimpleDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
