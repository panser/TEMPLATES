package itvdn.b_structural.f_Flyweight.pattern;

import itvdn.b_structural.f_Flyweight.pattern.impl.ConcreteFlyweight;
import itvdn.b_structural.f_Flyweight.pattern.impl.UnsharedConcreteFlyweight;

import java.util.HashMap;

/**
 * Created by Sergey on 11/29/2015.
 */
public class FlyweightFactory {

    HashMap<String, Flyweight> pool = new HashMap();

    public Flyweight getConcreteFlyweight(String key){
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteFlyweight());
        }

        return pool.get(key);
    }

    public Flyweight getUnsharedConcreteFlyweight()
    {
        return new UnsharedConcreteFlyweight();
    }
}
