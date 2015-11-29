package itvdn.a_creational.c_FactoryMethod;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Creator {

    Product product;

    public abstract Product factoryMethod();

    public void anOperation(){
        product = factoryMethod();
    }
}
