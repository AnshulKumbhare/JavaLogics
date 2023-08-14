import java.util.Scanner;

/**This code checks if the entered year is a Leap Year or not.
 * There are two condition for a year to be Leap Year.
 * 1. (year%4==0 && year%100!=0)
 * 2. (year%400==0)*/

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year  =sc.nextInt();

        if (year%4==0 && year%100!=0)
            System.out.println("Yes");
        else if (year%400==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
