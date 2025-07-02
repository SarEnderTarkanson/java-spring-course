
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " | " + price + " | " + name);
    }
}

public class Demo {
    public static void main(String args[]) {

        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 12500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 17500;
        Mobile.name = "SmartPhone";

        obj.show();
        obj2.show();
    }

}
