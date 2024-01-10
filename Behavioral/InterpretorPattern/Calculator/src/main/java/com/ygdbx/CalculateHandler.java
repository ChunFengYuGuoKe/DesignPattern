package com.ygdbx;

import com.ygdbx.expression.AbstractExpression;
import com.ygdbx.expression.impl.AddExpression;
import com.ygdbx.expression.impl.MinusExpression;
import com.ygdbx.expression.impl.ValueExpression;

import java.util.Stack;

public class CalculateHandler {
    private AbstractExpression expression;

    public void handle(String formula) {
        AbstractExpression calculateExpression = null;
        AbstractExpression left = null, right = null;
        Stack stack = new Stack();
        // 转换成char串
        String[] expressions = formula.split(" ");
        for (int i = 0; i < expressions.length; i++) {
            if (expressions[i].equals("+")) {
                left = (AbstractExpression) stack.pop();
                right = new ValueExpression(expressions[++i]);
                calculateExpression = new AddExpression(left, right);
                stack.push(calculateExpression);
            } else if (expressions[i].equals("-")) {
                left = (AbstractExpression) stack.pop();
                right = new ValueExpression(expressions[++i]);
                calculateExpression = new MinusExpression(left, right);
                stack.push(calculateExpression);
            }else {
                left = new ValueExpression(expressions[i]);
                stack.push(left);
            }
        }
        expression = (AbstractExpression) stack.pop();
    }

    public int calculate() {
        return expression.calculate();
    }
}
