package itvdn.b_structural.d_Decorator.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public abstract class Decorator extends Component{

    public Component component;


    protected Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
