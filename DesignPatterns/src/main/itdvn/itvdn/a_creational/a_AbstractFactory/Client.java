package itvdn.a_creational.a_AbstractFactory;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Client {

    private AbstractProductA abstractProductA = null;
    private AbstractProductB abstractProductB = null;

    public Client(AbstractFactory factory)
    {
        this.abstractProductA = factory.createProductA();
        this.abstractProductB = factory.createProductB();
    }

    public void Run()
    {
        this.abstractProductB.interact(this.abstractProductA);
    }
}
