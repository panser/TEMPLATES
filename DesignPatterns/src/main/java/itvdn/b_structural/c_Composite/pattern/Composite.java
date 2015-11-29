package itvdn.b_structural.c_Composite.pattern;

import java.util.ArrayList;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Composite extends Component {

    ArrayList<Component> nodes = new ArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name);
        for(Component component : nodes){
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        nodes.add(component);
    }

    @Override
    public void remove(Component component) {
        nodes.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return nodes.get(index);
    }
}
