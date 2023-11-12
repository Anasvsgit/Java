import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int c =input.nextInt();
        int a = 0;
        int b = 1;
        for(int d =1; d<=100;d++){
            d = a+b;
            a = b;
            b = d;

            System.out.println(d);


        }
    }
}
