package com.ygdbx.expression.impl;

import com.ygdbx.expression.AbstractExpression;

public class ValueExpression extends AbstractExpression {
    private String value;

    @Override
    public int calculate() {
        char[] valueCharArray = value.toCharArray();
        int result = 0;
        for (char c : valueCharArray) {
            int num = c - '0';
            result = result * 10 + num;
        }
        return result;
    }

    public ValueExpression(String value) {
        this.value = value;
    }
}
