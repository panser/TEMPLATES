package itvdn.b_structural.c_Composite.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Component {

    protected String name;

    public Component(String name)
    {
        this.name = name;
    }

    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int index);
}
