import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        Float c = sc.nextFloat();

        Float f = (c*9/5)+32;
        System.out.println(f);
    }
}
