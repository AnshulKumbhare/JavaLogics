import java.util.Scanner;

/**Given an Array, we need to find if the Array is Sorted i.e. if elements are in ascending order.*/

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int []arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted(int arr[]){
        boolean isSorted = true;
        for (int i=1; i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
}
