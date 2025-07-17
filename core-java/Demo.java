interface A {

    int age = 18;
    String area = "Steinkjer";

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("on config");
    }

    public void run() {

    }
}

public class Demo {
    public static void main(String args[]) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj2 = new B();
        obj2.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }

}
