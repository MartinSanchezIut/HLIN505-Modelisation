package martin.fac.dm1;

import java.util.Iterator;

public class LNode<Type> extends LabelledElement<Type> implements Iterable<LNode<Type>>{

    LEdge<?> leftEdge;
    LEdge<?> rightEdge;

    public LNode(Type label) {
        super(label);
    }

    public LNode<Type> addNewLeftNode(Type labeln, Type labele) {
        LNode<Type> left=new LNode<>(labeln);
        leftEdge=new LEdge<>(labele, this, left);
        return left;
    }

    public LNode<Type> addNewRightNode(Type labeln, Type labele) {
        LNode<Type> right=new LNode<>(labeln);
        rightEdge=new LEdge<>(labele, this, right);
        return right;
    }

    public String dfsdump() {
        String left=leftEdge!=null?" "+leftEdge.getLabel()+" "+leftEdge.getSon().dfsdump():"";
        String right=rightEdge!=null?" "+rightEdge.getLabel()+" "+rightEdge.getSon().dfsdump():"";
        return label+left+right;
    }

    public LNode<Type> getRightNode(){
        return rightEdge!=null? (LNode<Type>) rightEdge.getSon() :null;
    }

    public LNode<Type> getLeftNode(){
        return leftEdge!=null? (LNode<Type>) leftEdge.getSon() :null;
    }

    @Override
    public Iterator<LNode<Type>> iterator() {
        return new LNodeIterator<Type>(this);
    }

    public LEdge<?> getLeftEdge() {
        return leftEdge;
    }
}