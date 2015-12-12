package itvdn.c_behavioral.l_Visitor.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);
}
