import java.util.Scanner;

/**Given an integer S, printing the square of size S using '*' character. */

public class PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        int s = sc.nextInt();

        printPattern(s);
    }

    public static void printPattern(int s){
        for (int i=0; i<s; i++){
            if (i==0 || i==(s-1)){
                for (int j=0; j<s; j++)
                    System.out.print("* ");
            }
            else {
                for (int j=0; j<s; j++){
                    if (j==0 || j==(s-1))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
