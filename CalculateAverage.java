import java.util.Scanner;

/**Printing the average of all Array elements*/

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getAvg(arr,n));
    }

    public static double getAvg(int arr[], int n){
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+=arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
}
