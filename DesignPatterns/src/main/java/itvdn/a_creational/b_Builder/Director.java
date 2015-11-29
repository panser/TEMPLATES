package itvdn.a_creational.b_Builder;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Director {

    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void Construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
