public class Waitress {

    public static void main(String[] args) {

        Menu breakfastMenu = new Menu("Breakfast Menu", "Breakfast Menu");
        breakfastMenu.Add(new MenuItem("Pancake", "Pancake with jam", true, 8.0));
        breakfastMenu.Add(new MenuItem("Bacon", "Bacon with scrambled Eggs", false, 12.0));

        breakfastMenu.print();


        Menu lunchMenu = new Menu("Lunch Menu", "Lunch Menu");

        lunchMenu.Add(new MenuItem("Chicken","Grilled chicken",false, 25.5));
        lunchMenu.Add(new MenuItem("Asian Ramen Salad","Ramen noodles, green onion and canola oil",true, 21.0));
        lunchMenu.Add(new MenuItem("Burger","Arizona Burger with cheese", false, 30.5));
        lunchMenu.print();

        Menu dinnerMenu = new Menu("Dinner Menu", "Dinner Menu");

        dinnerMenu.Add(new MenuItem("Soup","Chicken Soup",false, 15));
        dinnerMenu.Add(new MenuItem("Steak","Grilled steak",false, 27.5));
        dinnerMenu.Add(new MenuItem("Spring Asparagus Salad","asparagus, olive oil and lemon zest", true, 20.0));

        dinnerMenu.print();
    }
}
