class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class Demo {
    public static void main(String args[]) {

        A obj = new B();

        obj.show1();

        B obj2 = (B) obj;
        obj2.show2();
    }

}
