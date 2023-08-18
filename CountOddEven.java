import java.util.Scanner;

/**Given an array A of N elements.
 * The task is to count number of even and odd elements in the array. */

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }

        count(arr,n);
    }

    public static void count(int arr[], int n){
        int countOdd = 0;
        int countEven = 0;
        for (int i=0; i<n; i++){
            if (arr[i]%2==0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println(countOdd+" "+countEven);
    }
}
