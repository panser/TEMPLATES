package itvdn.c_behavioral.l_Visitor.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB(){
        System.out.println("OperationB");
    }
}
