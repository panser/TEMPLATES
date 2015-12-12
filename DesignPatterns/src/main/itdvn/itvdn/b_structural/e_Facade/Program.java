package itvdn.b_structural.e_Facade;

import itvdn.b_structural.e_Facade.pattern.Facade;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.operationAB();
        facade.operationBC();
    }
}
