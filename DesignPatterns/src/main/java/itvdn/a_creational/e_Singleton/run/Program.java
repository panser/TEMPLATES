package itvdn.a_creational.e_Singleton.run;

import itvdn.a_creational.e_Singleton.Singleton;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.Instance();
        Singleton instance2 = Singleton.Instance();
        System.out.println(instance1 == instance2);

    }
}
