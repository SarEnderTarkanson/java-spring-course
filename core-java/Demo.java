interface A {

    int age = 18;
    String area = "Steinkjer";

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("on config");
    }
}

public class Demo {
    public static void main(String args[]) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.area);
    }

}
