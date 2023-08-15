import java.util.Scanner;

/** Printing LCM of two numbers*/

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int y = a*b;
        int x = Math.max(a,b);
        int ans = x;
        for (int i=x; i<=y;i++){
            if (i%a==0 && i%b==0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
