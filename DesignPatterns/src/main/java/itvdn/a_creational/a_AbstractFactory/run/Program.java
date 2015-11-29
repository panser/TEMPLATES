package itvdn.a_creational.a_AbstractFactory.run;

import itvdn.a_creational.a_AbstractFactory.Client;
import itvdn.a_creational.a_AbstractFactory.impl.ConcreteFactory1;
import itvdn.a_creational.a_AbstractFactory.impl.ConcreteFactory2;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Client client = null;

        client = new Client(new ConcreteFactory1());
        client.Run();

        client = new Client(new ConcreteFactory2());
        client.Run();
    }
}
