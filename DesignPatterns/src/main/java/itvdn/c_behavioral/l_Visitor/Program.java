package itvdn.c_behavioral.l_Visitor;

import itvdn.c_behavioral.l_Visitor.pattern.*;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());

        structure.Accept(new ConcreteVisitor1());
        structure.Accept(new ConcreteVisitor2());
    }
}
