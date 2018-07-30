package strategy.impl;

import strategy.Strategy;

/**
 * @author haoman
 * @Date 2018/7/30 上午10:10
 */
public class OperationMultiply  implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
