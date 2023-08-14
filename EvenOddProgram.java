import java.util.Scanner;

/**This code will check if the input is either 'Negative' or 'Positive'.
 * Along with it will also check for Even or Odd. */

public class EvenOddProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n>0){
            System.out.print("Positive ");
            if (n%2==0)
                System.out.print("Even");
            else
                System.out.print("Odd");
        }
        else if (n<0){
            System.out.print("Negative ");
            if (n%2==0)
                System.out.print("Even");
            else
                System.out.print("Odd");
        }
        else
            System.out.println("0");
    }
}
