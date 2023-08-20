import java.util.Scanner;

/**Finding the sum of all Array elements.*/

public class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getSum(arr));
    }

    public static int getSum(int arr[]){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
