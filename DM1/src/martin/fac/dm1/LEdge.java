package martin.fac.dm1;

public class LEdge<Type> extends LabelledElement<Type> {

    //private Type label;
    private LNode<?> father;
    private LNode<?> son;

    /*
    public Type getLabel() {
        return super.getLabel();
    }*/

    public LEdge(Type label, LNode<?> father, LNode<?> son) {
        super(label) ;
        //this.label= label ;
        this.father = father;
        this.son = son;
    }

    public LNode<?> getFather() {
        return father;
    }

    public LNode<?> getSon() {
        return son;
    }

}
