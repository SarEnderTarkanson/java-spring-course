
public class Demo {
    public static void main(String args[]) {

        int num = 7;

        Integer num2 = num;

        int num3 = num2.intValue();

        Integer num4 = 8;

        String str = "12";

        int num5 = Integer.parseInt(str);


        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5 * 2);
    }

}
