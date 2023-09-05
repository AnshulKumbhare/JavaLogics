import java.util.Scanner;

/**Given an array arr[] of size n, find count of all the distinct elements in an array.*/

public class FindDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(calcDistinct(arr,n));
    }

    private static int calcDistinct(int arr[], int n) {
        int countDistinct = 1;
        for (int i = 1; i < n; i++) {
            boolean isDistinct = true;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct == true)
                countDistinct = countDistinct+1;
        }
        return countDistinct;
    }
}

