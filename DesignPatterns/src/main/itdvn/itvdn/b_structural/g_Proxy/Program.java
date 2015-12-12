package itvdn.b_structural.g_Proxy;

import itvdn.b_structural.g_Proxy.pattern.Proxy;
import itvdn.b_structural.g_Proxy.pattern.Subject;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Subject subject = new Proxy();
        subject.request();
    }
}
