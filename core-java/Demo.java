class Demo {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 5) {

            System.out.println(String.format("Week # %d", i));;
            int j = 1;
            while (j <= 7) {
                System.out.println(String.format("The day # %d", j));
                j++;
            }
            i++;
        }
        System.out.println("Exit the entire loop.");
    }
}
