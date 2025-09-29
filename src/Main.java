import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        int yearlyCost = 0;

        System.out.print("Enter your home maintainence cost for Winter: ");
        winter = in.nextInt();

        System.out.print("Enter your home maintainence cost for Spring: ");
        spring = in.nextInt();

        System.out.print("Enter your home maintainence cost for Summer: ");
        summer = in.nextInt();

        System.out.print("Enter your home maintainence cost for Fall: ");
        fall = in.nextInt();

        yearlyCost = winter + spring + summer + fall;
        System.out.println("The total yearly cost is $" + yearlyCost);
    }
}
