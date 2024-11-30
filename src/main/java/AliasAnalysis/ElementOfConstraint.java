package AliasAnalysis;

public class ElementOfConstraint implements Constraint{
    private final MemoryLocation element;
    private final PointsToSet set;
   public  ElementOfConstraint(MemoryLocation e , PointsToSet set ) {
        this.set= set;
        this.element=e;
    }

    public String toString(){ return element +" is an element of "+ set.getVar();}

    public MemoryLocation getElement() {
        return element;
    }

    public PointsToSet getSet() {
        return set;
    }
}