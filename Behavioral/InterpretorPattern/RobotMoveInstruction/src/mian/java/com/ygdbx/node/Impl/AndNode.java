package com.ygdbx.node.Impl;

import com.ygdbx.node.AbstractNode;

/**
 * And解释：非终结符表达式
 */
public class AndNode extends AbstractNode {
    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right){
        this.left = left;
        this.right = right;
    }

    public String interpret(){
        return left.interpret() + "再" + right.interpret();
    }
}
