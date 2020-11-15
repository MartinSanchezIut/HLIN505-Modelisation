package martin.fac.dm1;

import java.util.Iterator;
import java.util.Stack;

public class LNodeIterator<T> implements Iterator<LNode<T>> {

    Stack<LNode<T>> stack ;

    public LNodeIterator(LNode<T> typeLNode) {
        stack = new Stack<>();

        stack.add(typeLNode);

        //addToStack(typeLNode);

    }

    public void printStack() {
        for (LNode<T> n: stack) {
            System.out.println(n);
        }
    }

    public void addToStack(LNode<T> typeLNode) {
        if (typeLNode.getRightNode() != null) {
            stack.push(typeLNode.getRightNode());
        }
        if (typeLNode.getLeftNode() != null) {
            stack.push(typeLNode.getLeftNode());
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public LNode<T> next() {
        LNode<T> ret = stack.pop();
        addToStack(ret);
        return ret;
    }
}
