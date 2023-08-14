import java.util.Scanner;

/**In this program, We will be finding nth term using AP.*/

public class Arithmaticprogression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter Common Difference: ");
        int d = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println(Nth_term(a,d,n));
    }

    public static int Nth_term(int a, int d, int n){
        return (a+(n-1)*d);
    }
}
