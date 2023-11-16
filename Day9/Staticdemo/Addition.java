package Staticdemo;

public class Addition {

        // Static block
        static {
            System.out.println("Executing Static block");
        }

        // Constructor
        public Addition() {
            System.out.println("calling constructor");
        }

        // Static method for addition
        public static int add(int num1, int num2) {
            return num1 + num2;
        }

        public static void main(String[] args) {

            int sum = add(65, 9);
            Addition a1=new Addition();
            System.out.println("Sum: " + sum);


        }
}
