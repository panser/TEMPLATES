package itvdn.c_behavioral.a_Chain_of_Responsibility.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Handler {

    public Handler successor;
    public abstract void handleRequest(int request);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
