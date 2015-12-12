package itvdn.c_behavioral.l_Visitor.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA(){
        System.out.println("OperationA");
    }
}
