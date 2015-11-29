package itvdn.c_behavioral.b_Command.pattern.impl;

import itvdn.c_behavioral.b_Command.pattern.Command;
import itvdn.c_behavioral.b_Command.pattern.Receiver;

/**
 * Created by Sergey on 11/29/2015.
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
