package itvdn.a_creational.b_Builder;

import java.util.ArrayList;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Product {

    ArrayList<String> parts = new ArrayList();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for(String part : parts){
            System.out.println(part);
        }
    }
}
