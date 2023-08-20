import java.util.Scanner;

/**Printing maximum element in an Array. */

public class MaximumInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getMax(arr,n));
    }

    public static int getMax(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for ( int i=0; i<n; i++){
            if (max<arr[i])
                max = arr[i];
        }
        return max;
    }
}