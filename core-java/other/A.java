package other;

class Launch extends A{

    public void ABC() {
        A obj = new A();
        System.out.println(obj.marks);
    }

}

public class A {
    protected int marks = 6;

    public void show(){

    }
}
