enum Status {
    Running, Failed, Pending, Success
}

public class Demo {
    public static void main(String args[]) {

        Status[] s = Status.values();

        for (Status i : s)
            System.out.println(i + ": " + i.ordinal());

    }

}
