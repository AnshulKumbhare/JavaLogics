import java.util.Scanner;

/**Given a number N, finding the first digit of the number.*/

public class FirstDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(printFirstDigit(n));
    }

    public static int printFirstDigit(int n){
        while (n>10){
            n = n/10;
        }
        return n;
    }
}
