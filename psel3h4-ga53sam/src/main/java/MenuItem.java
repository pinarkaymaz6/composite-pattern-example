public class MenuItem extends MenuComponent {
    boolean vegetarian;
    double price;


    public MenuItem(String name, String description, boolean vegetarian, double price) {
        super(name, description);
        this.price=price;
        this.vegetarian=vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {

        return vegetarian;
    }

    public void print() {
        String veg = vegetarian?"/ Vegetarian":"";
        System.out.println(getName()+": "+getDescription()+veg+"  ("+price+")");
    }

}
