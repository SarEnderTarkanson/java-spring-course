//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo {
    public static void main(String args[]) {

        Map<String, Integer> students = new Hashtable<>();

        students.put("Alpy", 39);
        students.put("Beyza", 10);
        students.put("Ender", 7);
        students.put("Makbule", 38);
        students.put("Alpy", 40);

        // System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + ": " + students.get(key));
        }
    }

}
