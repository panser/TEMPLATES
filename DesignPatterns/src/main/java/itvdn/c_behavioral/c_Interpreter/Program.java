package itvdn.c_behavioral.c_Interpreter;

import itvdn.c_behavioral.c_Interpreter.pattern.AbstractExpression;
import itvdn.c_behavioral.c_Interpreter.pattern.Context;
import itvdn.c_behavioral.c_Interpreter.pattern.NonterminalExpression;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Context context = new Context('a',"aaa");

        AbstractExpression expression = new NonterminalExpression();
        expression.interpret(context);

        System.out.println(context.isResult());
    }
}
