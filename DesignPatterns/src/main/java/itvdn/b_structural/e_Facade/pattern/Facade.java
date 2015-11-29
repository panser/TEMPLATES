package itvdn.b_structural.e_Facade.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Facade {

    SubSystemA subSystemA = new SubSystemA();
    SubSystemB subSystemB = new SubSystemB();
    SubSystemC subSystemC = new SubSystemC();

    public void operationAB()
    {
        subSystemA.operationA();
        subSystemB.operationB();
    }

    public void operationBC()
    {
        subSystemB.operationB();
        subSystemC.operationC();
    }
}
