import java.util.Scanner;

/*This code checks for the palindrome.*/

public class CheckForPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Text: ");
        String s = sc.nextLine();

        System.out.println(palindrome(s));
    }

    private static boolean palindrome(String s){
        int start = 0;
        int end = s.length()-1;
        boolean isPal = true;
        while (start<end){
            if (s.charAt(start) != s.charAt(end)){
                isPal = false;
                break;
            }
            start++;
            end--;
        }
        return isPal;
    }
}
