abstract class A {
    public abstract void show();

    public abstract void config();
}

public class Demo {
    public static void main(String args[]) {

        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();

    }

}
