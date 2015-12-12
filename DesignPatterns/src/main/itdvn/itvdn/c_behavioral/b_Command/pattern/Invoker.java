package itvdn.c_behavioral.b_Command.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Invoker {

    Command command;

    public void storeCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
