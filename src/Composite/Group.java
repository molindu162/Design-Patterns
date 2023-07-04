package Composite;
import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private List<Component> group = new ArrayList<>();

    public void addComponent(Component component){
        group.add(component);
    }
    @Override
    public void render() {
        for (var component: group){
            component.render();
        }
    }
}
