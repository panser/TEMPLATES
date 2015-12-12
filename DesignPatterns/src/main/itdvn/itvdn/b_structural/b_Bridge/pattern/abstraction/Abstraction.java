package itvdn.b_structural.b_Bridge.pattern.abstraction;

import itvdn.b_structural.b_Bridge.pattern.implementor.Implementor;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Abstraction {

    protected Implementor implementor = null;

    public Abstraction(Implementor implementor)
    {
        this.implementor = implementor;
    }

    //virtual
    public void operation(){
        implementor.operationImp();
    }
}
