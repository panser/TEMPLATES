package itvdn.a_creational.e_Singleton;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Singleton {

    static Singleton uniqueInstance;

    protected Singleton(){
    }

    public static Singleton Instance(){
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }

}
