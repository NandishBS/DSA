import java.util.Scanner;

public class Palindrome {

    // reversing an array
    // Time Complexity = O(log10n)
    // Space Complexity = O(1)
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            n /= 10;
            rev = rev * 10 + lastdigit;
        }
        return rev;
    }

    // calls reverse function and compare
    // Time Complexity = O(log10n)
    // Space Complexity = O(1)
    static boolean isPalindrome(int n){
        int rev = reverse(n);
        if(n == rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int n1 = reverse(n);
            System.out.println(n1);
            System.out.println(isPalindrome(n));
            sc.close();
    }
}
