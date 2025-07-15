class A {

    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B {
        public void config() {

            System.out.println("in config");
        }
    }
}

public class Demo {
    public static void main(String args[]) {

        A obj = new A();

        obj.show();

        A.B obj2 = new A.B();

        obj2.config();

    }

}
