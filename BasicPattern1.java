import java.util.Scanner;

/** Printing Pattern:  ****
 *                     ****
 *                     ****
 *                     ****  */

public class BasicPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
