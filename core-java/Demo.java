import other.*;


class C extends A{
    public void ABC(){
        System.out.println(marks);
    }
}

public class Demo {
    public static void main(String args[]) {

        A obj = new A();
        System.out.println(obj.marks);
        obj.show();

        B obj2 = new B();
        System.out.println(obj2.marks);
    }

}
