import java.util.Scanner;

/**This program calculates the BMI of an indivisual.
 * It takes in weight(kg) and height (cm/m).*/

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight w(in kgs): ");
        double w = sc.nextDouble();
        System.out.print("Enter height h: ");
        double h = sc.nextDouble();
        System.out.print("Is height in \"cm / m\": ");
        String s = sc.next();

        if (s.equals("cm")){
            double ans = (w/h/h)*10000;
            System.out.println(ans);
        }
        else {
            double ans = w/h;
            System.out.println(ans);
        }
    }
}
