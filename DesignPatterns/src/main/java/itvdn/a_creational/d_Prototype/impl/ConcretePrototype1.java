package itvdn.a_creational.d_Prototype.impl;

import itvdn.a_creational.d_Prototype.Prototype;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(id);
    }
}
