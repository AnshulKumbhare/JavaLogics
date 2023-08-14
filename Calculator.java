import java.util.Scanner;

/**This code perform the function of a calculator performing basic 4 function
 * which are Addition, Subtraction, Multiplication, Division.
 * The following cod asks the user for the operation input and 2 numbers a and b.
 * it then prints the result of that operation */

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("SELECT FROM THE FOLLOWING OPERATION: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        System.out.print("Enter the (1-4) for the operation: ");
        int operation = sc.nextInt();
        switch (operation){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}

