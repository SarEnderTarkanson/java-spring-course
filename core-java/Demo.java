
class Human {

    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
