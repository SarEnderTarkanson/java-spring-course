
class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " | " + price + " | " + name);
    }


}

public class Demo {
    public static void main(String args[]) throws ClassNotFoundException {


    Class.forName("Mobile");
        // Mobile obj = new Mobile();
        // obj.brand = "Apple";
        // obj.price = 12500;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
    }

}
