package com.ygdbx.expression.impl;

import com.ygdbx.expression.AbstractExpression;

public class MinusExpression extends AbstractExpression {
    AbstractExpression left;
    AbstractExpression right;

    @Override
    public int calculate() {
        return left.calculate() - right.calculate();
    }

    public MinusExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
}
