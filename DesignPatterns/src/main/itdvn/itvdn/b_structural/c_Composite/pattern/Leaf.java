package itvdn.b_structural.c_Composite.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);
    }

    @Override
    public void add(Component component) {
        throw new IllegalStateException();
    }

    @Override
    public void remove(Component component) {
        throw new IllegalStateException();
    }

    @Override
    public Component getChild(int index) {
        throw new IllegalStateException();
    }
}
