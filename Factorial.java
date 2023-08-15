import java.util.Scanner;

/**This code will take a number input and print factorial of that number.
 * 5! = 5*4*3*2*1 = 120. */

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ans = 1;
        for (int i=1; i<=n; i++){
            ans = ans*i;
        }
        System.out.println(ans);
    }
}
