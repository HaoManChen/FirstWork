package strategy.impl;

import strategy.Strategy;

/**
 * @author haoman
 * @Date 2018/7/30 上午10:09
 */

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
