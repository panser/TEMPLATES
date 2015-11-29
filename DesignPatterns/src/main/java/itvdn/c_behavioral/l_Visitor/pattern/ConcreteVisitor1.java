package itvdn.c_behavioral.l_Visitor.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        elementA.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        elementB.operationB();
    }
}
