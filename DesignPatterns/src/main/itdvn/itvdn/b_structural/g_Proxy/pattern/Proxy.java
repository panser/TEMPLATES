package itvdn.b_structural.g_Proxy.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void request() {

        if (realSubject == null)
            realSubject = new RealSubject();

        realSubject.request();
    }
}
