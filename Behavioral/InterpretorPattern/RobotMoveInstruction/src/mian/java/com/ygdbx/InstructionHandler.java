package com.ygdbx;

import com.ygdbx.node.AbstractNode;
import com.ygdbx.node.Impl.*;

import java.util.Stack;

/**
 * 指令处理类：工具类
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack stack = new Stack();
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("and")) {
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance); //右表达式
                stack.push(new AndNode(left, right));//将新表达式压入栈中
            }
            else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);//将新表达式压入栈中
            }
        }
        this.node = (AbstractNode) stack.pop();
    }

    public String output() {
        String result = node.interpret();
        return result;
    }
}
