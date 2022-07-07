import java.util.Scanner;

public class IfElseDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();
        if (age >= 60) {
            System.out.println("you are a senior citizen");
        } else if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
    }
}