package itvdn.a_creational.d_Prototype.impl;

import itvdn.a_creational.d_Prototype.Prototype;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(id);
    }
}
