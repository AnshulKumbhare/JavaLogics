import java.util.Scanner;


/**In this code, We will be taking in the input of String type and printing the digits ont the right side of the decimal.*/
public class DigitAfterDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine();

        digitAfterDeci(num);
    }

    private static void digitAfterDeci(String num){
        int ptr = num.indexOf('.');
        if (ptr<0)
            System.out.println("-1");
        else
            System.out.println(num.substring(ptr+1));
    }
}
