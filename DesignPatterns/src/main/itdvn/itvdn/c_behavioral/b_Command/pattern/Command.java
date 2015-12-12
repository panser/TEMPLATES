package itvdn.c_behavioral.b_Command.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
