package itvdn.a_creational.b_Builder.run;

import itvdn.a_creational.b_Builder.Builder;
import itvdn.a_creational.b_Builder.Director;
import itvdn.a_creational.b_Builder.Product;
import itvdn.a_creational.b_Builder.impl.ConcreteBuilder;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.Construct();

        Product product = builder.getResult();
        product.show();
    }
}
