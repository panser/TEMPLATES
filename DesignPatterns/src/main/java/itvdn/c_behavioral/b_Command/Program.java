package itvdn.c_behavioral.b_Command;

import itvdn.c_behavioral.b_Command.pattern.Command;
import itvdn.c_behavioral.b_Command.pattern.Invoker;
import itvdn.c_behavioral.b_Command.pattern.Receiver;
import itvdn.c_behavioral.b_Command.pattern.impl.ConcreteCommand;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Program {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.storeCommand(command);
        invoker.executeCommand();
    }
}
