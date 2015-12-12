package itvdn.c_behavioral.l_Visitor.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA elementA);
    public abstract void visitConcreteElementB(ConcreteElementB elementB);
}
