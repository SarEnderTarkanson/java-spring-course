public class Demo {
    public static void main(String args[]) {
        
        String endo = new String("Endo");

        endo = "Beyza";

        StringBuffer sb = new StringBuffer("Alpy");

        sb.append(" Tarkanson");

        sb.deleteCharAt(10);

        sb.insert(0, "Mr. ");

        System.out.println(sb);
    }

}
