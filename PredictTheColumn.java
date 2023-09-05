import java.util.Scanner;

/**Given a matrix(2D array) M of size N*N consisting of 0s and 1s only.
 * The task is to find the column with maximum number of 0s.*/

public class PredictTheColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int M[][] = new int[n][n];
        for (int i=0; i<n; i++){
            for ( int j=0; j<n; j++){
                M[i][j] = sc.nextInt();
            }
        }

        System.out.println(maxZeros(M,n));
    }

    private static int maxZeros(int arr[][], int n){
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int j=0; j<n; j++){
            int zeroes = 0;
            for (int i=0; i<n; i++){
                if (arr[i][j]==0)
                    zeroes++;
            }
            if (zeroes>max){
                max = zeroes;
                ans = j;
            }
        }
        return ans;
    }
}
