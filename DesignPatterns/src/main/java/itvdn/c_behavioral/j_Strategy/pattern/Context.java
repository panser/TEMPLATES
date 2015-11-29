package itvdn.c_behavioral.j_Strategy.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
