
class Human {

    private int age;
    private String name;

    public Human() {
        age = 18;
        name = "John Doe";
    }

    // public Human(int a, String n) {
    //     age = a;
    //     name = n;
    // }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

        Human obj2 = new Human(38, "Makbule");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        System.out.println(obj2.getAge());
        System.out.println(obj2.getName());
    }

}
