import java.util.Scanner;
/**The following code prints Table of a Number. */
public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();

        printTable(n,d);
    }

    private static void printTable(int n, int d){
        int ans = 0;
        for (int i=1; i<=d; i++){
            ans = n*i;
            System.out.printf("\n%d * %d = ",n,i);
            System.out.print(ans+" ");
        }
    }
}
