import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amt P: ");
        double P = sc.nextDouble();
        System.out.print("Enter Rate of Interest r: ");
        double r = sc.nextDouble();
        System.out.print("Enter time(in years) t: ");
        double t = sc.nextDouble();

        double amt = P*(Math.pow((1+r/100),t));
        double CI = amt-P;
        System.out.println(P+" "+amt+" "+CI);
    }
}
