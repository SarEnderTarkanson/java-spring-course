class A extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
        }
    }
}

public class Demo {
    public static void main(String args[]) {

        A obj = new A();
        B obj2 = new B();

        obj.start();
        obj2.start();

    }

}
