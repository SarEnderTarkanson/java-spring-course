enum Status {
    Running, Failed, Pending, Success
}

public class Demo {
    public static void main(String args[]) {

        Status s = Status.Success;

        switch (s) {
            case Running: {
                System.out.println("all good");
            }
                break;
            case Failed: {
                System.out.println("try again");
            }
                break;
            case Pending: {
                System.out.println("please wait");
            }
                break;
            default: {
                System.out.println("Done");
            }
        }

        // if (s == Status.Running) {
        //     System.out.println("all good");
        // } else if (s == Status.Failed) {
        //     System.out.println("try again");
        // } else if (s == Status.Pending) {
        //     System.out.println("please wait");
        // } else {
        //     System.out.println("Done");
        // }
    }

}
