import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> componentList = new ArrayList<MenuComponent>();
    public Menu(String name, String description) {
        super(name, description);
    }

    public void print() {
        System.out.println("---"+getName()+"---");
        for(MenuComponent c:componentList){
            c.print();
        }
    }
    public void Add(MenuComponent component){
        componentList.add(component);
    }

    public void Remove(MenuComponent component){
        componentList.remove(component);
    }

    public MenuComponent getChild(int child){
        return componentList.get(child);
    }


}
