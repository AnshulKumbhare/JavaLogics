import java.util.Scanner;

/**In this program, We will find the largest of the three number <a>,<b>,<c>.
 * There are two ways:
 * 1. Using if-else statement.
 * 2. Using the Math.max() function.*/

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        Method1(a,b,c);
        Method2(a,b,c);
    }

    private static void Method1(int a, int b, int c){
        if (a>b && a>c){
            System.out.println(a);
        }
        else if (b>a && b>c){
            System.out.println(b);
        }
        else
            System.out.println(c);
    }

    private static void Method2(int a, int b, int c){
        int ans_1 = Math.max(a,b);
        int ans = Math.max(ans_1,c);
        System.out.println(ans);
    }
}
