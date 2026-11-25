public class MenuItem {
    String name;
    double price;
    boolean isVeg;

    public static void main(String args[]) {
        // 1 : Munu item
        MenuItem dosa = new MenuItem();

        dosa.name = "Masala Dosa";
        dosa.price = 120;
        dosa.isVeg = true;

        System.out.println(dosa.name);
        System.out.println(dosa.price);
        System.out.println(dosa.isVeg);
        System.out.println();

        // 2 : Menu item
        MenuItem paneer = new MenuItem();

        paneer.name = "Paneer Tikka";
        paneer.price = 250;
        paneer.isVeg = true;

        System.out.println(paneer.name);
        System.out.println(paneer.price);
        System.out.println(paneer.isVeg);
        System.out.println();

        // 3 : Menu item
        MenuItem biryani = new MenuItem();

        biryani.name = "Briyani";
        biryani.price = 320;
        biryani.isVeg = false;

        System.out.println(biryani.name);
        System.out.println(biryani.price);
        System.out.println(biryani.isVeg);
    }
}