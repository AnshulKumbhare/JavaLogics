import java.util.Scanner;

/**Given a matrix M or r rows and c columns.
 * You need to swap the first column with the last column.*/

public class MatrixInterchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int M[][] = new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.printf("Enter element [%d][%d]: ",i,j);
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before Interchange");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }

        interchange(M,r,c);
    }

    public static void interchange(int M[][],int r, int c){
            for (int i=0; i<r; i++){
                int temp = M[i][0];
                M[i][0] = M[i][c-1];
                M[i][c-1] = temp;
            }
        System.out.println("After Interchange");
            for (int i=0; i<r; i++){
                for (int j=0; j<c; j++){
                    System.out.print(M[i][j]+" ");
                }
                System.out.println();
            }
    }
}
