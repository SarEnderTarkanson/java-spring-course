
class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String b){
        name = b;
    }
}

public class Demo {
    public static void main(String args[]) {

        Human obj = new Human();
        obj.setAge(39);
        obj.setName("Alpy");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }

}
