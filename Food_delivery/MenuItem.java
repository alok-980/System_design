public class MenuItem {
    String name;
    double price;
    boolean isVeg;

    public static void main(String args[]) {
        MenuItem dosa = new MenuItem();

        dosa.name = "Masala Dosa";
        dosa.price = 120;
        dosa.isVeg = true;

        System.out.println(dosa.name);
        System.out.println(dosa.price);
        System.out.println(dosa.isVeg);
    }
}