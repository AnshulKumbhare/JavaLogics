import java.util.Scanner;
/**Given an array A[] of size n. The task is to find the largest element in it.*/

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largestElement(arr));
    }

    private static int largestElement(int arr[]){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
