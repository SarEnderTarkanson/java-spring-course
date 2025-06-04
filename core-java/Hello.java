class Hello {
    public static void main(String args[]) {

        int num1 = 7;
        System.out.println(num1);
        // int num2 = 5;

        // int result = num1 % num2;

        num1++; //8
        System.out.println(num1);
        num1 += 5; //13
        System.out.println(num1);
        num1--; //12
        System.out.println(num1);

        int result = ++num1;
        System.out.println(result);

        int result2 = num1++;
        System.out.println(result2);

    }
}