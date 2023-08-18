import java.util.Scanner;

/**Given two number n1 and n2, n1 > n2.
 *Find the differences between mathematical tables of n1 and n2.*/

public class TableDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        tableDiff(n1,n2);
    }

    private static void tableDiff(int n1, int n2){
        int n = n1-n2;
        int i = 1;
        while (i<=10){
            System.out.println(n*i+" ");
            i++;
        }
    }
}
