package itvdn.c_behavioral.l_Visitor.pattern;

import java.util.ArrayList;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ObjectStructure {

    ArrayList<Element > elements = new ArrayList();

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

    public void Accept(Visitor visitor){
        for(Element element : elements){
            element.accept(visitor);
        }
    }
}
