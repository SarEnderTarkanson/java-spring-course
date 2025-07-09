class Calc {
    public final void show() {
        System.out.println("by Alpy");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
        ;
    }
}

class AdvCalc extends Calc {
    public void show() {
        System.out.println("by Endo");
    }
}

public class Demo {
    public static void main(String args[]) {

        Calc obj = new Calc();
        obj.show();
        obj.add(5, 5);

    }

}
