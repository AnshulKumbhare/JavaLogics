import java.util.Scanner;

/**In this program, We will print the last digit of the input.*/

public class LastDigitProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int n = Math.abs(num);
        int ans = n%10;
        System.out.println(ans);
    }
}
