package itvdn.c_behavioral.k_Template_Method.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
