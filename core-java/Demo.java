enum Laptop {
    MacBook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    private Laptop() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Demo {
    public static void main(String args[]) {

        // Laptop lap = Laptop.MacBook;

        // System.out.println(lap + ": " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ": " + lap.getPrice());
        }

    }

}
