package itvdn.b_structural.f_Flyweight;

import itvdn.b_structural.f_Flyweight.pattern.ConsoleColor;
import itvdn.b_structural.f_Flyweight.pattern.Flyweight;
import itvdn.b_structural.f_Flyweight.pattern.FlyweightFactory;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Flyweight [] flyweight = new Flyweight[100];
        FlyweightFactory factory = new FlyweightFactory();

        for (int i = 0; i < flyweight.length; i++)
        {
            flyweight[i] = factory.getConcreteFlyweight("1");
            flyweight[i].operation(ConsoleColor.YELLOW);
        }

        for (int i = 0; i < flyweight.length; i++)
        {
            flyweight[i] = factory.getUnsharedConcreteFlyweight();
            flyweight[i].operation(ConsoleColor.GREEN);
        }

    }
}
