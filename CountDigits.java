import java.util.Scanner;

/**This code counts the digits entered.
 * eg: num = 1235   ans = 4*/

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n  =sc.nextInt();

        countDigitsInNumber(n);
    }

    private static void countDigitsInNumber(int n){
        int count = 0;
        while (n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
