package itvdn.a_creational.b_Builder;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public abstract Product getResult();
}
