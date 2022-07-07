import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day:");
        int weeklytodolist = in.nextInt();
        switch (weeklytodolist) {
            case 1:
                System.out.println("Monday->Holiday");
                break;
            case 2:
                System.out.println("Tuesday->Go for a walk");
                break;
            case 3:
                System.out.println("Wednesday->Do homework");
                break;
            case 4:
                System.out.println("Turseday->Do grocery shopping");
                break;
            case 5:
                System.out.println("Friday->go for work");
                break;
            case 6:
                System.out.println("Saturday->do cleaning");
                break;
            case 7:
                System.out.println("Sunday->Take classes");
                break;
            default:
                System.out.println("Wrong option");
        }
    }
}