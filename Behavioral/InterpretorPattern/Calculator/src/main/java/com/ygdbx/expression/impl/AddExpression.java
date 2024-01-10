package com.ygdbx.expression.impl;

import com.ygdbx.expression.AbstractExpression;

/**
 * 加法表达式：非终止符表达式
 */
public class AddExpression extends AbstractExpression {
    AbstractExpression left;
    AbstractExpression right;

    @Override
    public int calculate() {
        return left.calculate() + right.calculate();
    }

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
}
