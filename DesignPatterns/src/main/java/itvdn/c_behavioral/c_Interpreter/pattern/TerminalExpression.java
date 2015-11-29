package itvdn.c_behavioral.c_Interpreter.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        context.setResult(context.getSource().charAt(context.getPosition()) == context.getVocabulary());
    }
}
