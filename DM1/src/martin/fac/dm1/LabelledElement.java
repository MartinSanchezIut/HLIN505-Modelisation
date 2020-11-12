package martin.fac.dm1;

public abstract class LabelledElement<TypeLabel> {

    TypeLabel label;

    public LabelledElement(TypeLabel label) {
        this.label = label;
    }

    public TypeLabel getLabel() {
        return label;
    }



}

