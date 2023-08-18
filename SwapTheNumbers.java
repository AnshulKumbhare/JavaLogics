import java.util.Scanner;

/**Given two numbers 'a' and 'b', you need to swap their values.
 * So 'a' holds the value of 'b' and 'b' holds the value of 'a'.
 */
public class SwapTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b respectively: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " "+b);
    }
}
