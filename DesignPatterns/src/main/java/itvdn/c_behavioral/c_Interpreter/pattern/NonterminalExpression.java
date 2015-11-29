package itvdn.c_behavioral.c_Interpreter.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class NonterminalExpression extends AbstractExpression {

    AbstractExpression nonterminalExpression;
    AbstractExpression terminalExpression;

    @Override
    public void interpret(Context context) {
        if (context.getPosition() < context.getSource().length()){
            terminalExpression = new TerminalExpression();
            terminalExpression.interpret(context);
            context.setPosition(context.getPosition() + 1);

            if (context.isResult()){
                nonterminalExpression = new NonterminalExpression();
                nonterminalExpression.interpret(context);
            }
        }

    }
}
