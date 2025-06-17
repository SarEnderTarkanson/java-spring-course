class Demo {
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(String.format("Day # %d", i));

            for (int j = 9; j <= 16; j++) {
                System.out.println(String.format("Hr # %d", j));
            }
        }
    }
}
