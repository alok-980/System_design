public class MenuItem {
    String name;
    double price;
    boolean isVeg;

    MenuItem(String name, double price, boolean isVeg) {
        this.name = name;
        this.price = price;
        this.isVeg = isVeg;
    }
}

MenuItem dosa = new MenuItem("Masala Dosa", 120, true);
MenuItem paneer = new MenuItem("Paneer Tikka", 250, true);
MenuItem bryani = new MenuItem("Biryani", 350, false);
