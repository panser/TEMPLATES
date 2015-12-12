package itvdn.c_behavioral.k_Template_Method;

import itvdn.c_behavioral.k_Template_Method.pattern.AbstractClass;
import itvdn.c_behavioral.k_Template_Method.pattern.ConcreteClass;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        AbstractClass instance = new ConcreteClass();
        instance.templateMethod();
    }
}
