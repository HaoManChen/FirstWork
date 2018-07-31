import strategy.impl.OperationAdd;
import strategy.impl.OperationMultiply;
import strategy.impl.OperationSubstract;

import java.util.Scanner;

/**
 * @author haoman
 * @Date 2018/7/30 上午10:06
 */
public class SimpleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context(new OperationAdd());
        int[] num= new int[2];
        int i = 0;
        while (scanner.hasNextInt()){
            num[i++]=scanner.nextInt();
            if (i>=num.length){
                break;
            }
        }
        System.out.println("10 + 5 = " + context.executeStrategy(num[0], num[1]));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
