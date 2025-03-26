import java.util.Scanner;

// Time complexity = O(n);
// Space complexity = O(1);

public class Factorial {
    static int factorial(int n){
        int res = 1;
        while(n>0){
            res *= n;
            n--;
        }
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}