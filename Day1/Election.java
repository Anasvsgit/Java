import java.util.Scanner;
public class Election {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age  =input.nextInt();
        if (age>=16 & age<=18){
            System.out.println("You are eligible to vote");
        } else if (age <15 & age>18) {
            System.out.println("You are not eligible to vote");
        }
        else{
            System.out.println("please enter the digits");
        }


    }
}
