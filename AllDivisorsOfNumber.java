import java.util.Scanner;

/**Printing Divisors of a number
 * Efficient Solution*/

public class AllDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // Normal Solution: Time: O(n)
        for (int i=1; i<=n; i++){
            if (n%i==0)
                System.out.print(i+" ");
        }
        System.out.println();

        //Efficient Solution
        for (int i=1; i*i<=n; i++){
            if (n%i==0){
                System.out.print("("+i+",");
                if (i!=n/i)
                    System.out.print((n/i)+")"+" ");
                else
                    System.out.print(")");
            }
        }
    }
}

