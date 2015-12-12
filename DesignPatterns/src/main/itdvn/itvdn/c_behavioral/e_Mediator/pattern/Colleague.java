package itvdn.c_behavioral.e_Mediator.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
