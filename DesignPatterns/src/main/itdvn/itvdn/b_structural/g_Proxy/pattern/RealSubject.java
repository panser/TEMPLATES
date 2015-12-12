package itvdn.b_structural.g_Proxy.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.printf("RealSubject");
    }
}
