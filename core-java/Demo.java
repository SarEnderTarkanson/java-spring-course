class Calculator {

    int num = 5;

    public int add(int n1, int n2) {

        // System.out.println(num);
        return n1 + n2;
    }
}

public class Demo {
    public static void main(String args[]) {

        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj2 = new Calculator();

        obj.num = 10;
        // int r1 = obj.add(3, 4);
        // System.out.println(data);
        // System.out.println(r1);
        System.out.println(obj2.num);
        System.out.println(obj.num);
    }
}
