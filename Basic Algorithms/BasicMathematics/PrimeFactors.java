import java.util.Scanner;

public class PrimeFactors {

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    static void printPrimeFactors(int n){
        for(int i=2;i<=n;i++){
            while (n%i==0) {
                n = n/i;
                System.out.println(i);
            }
        }
    }

    //efficient approach runs outer loop only upto root(n) instead of n
    // Time Complexity = O(root(n)log(n))
    // Space Complexity = O(1)
    static void printPrimeFactorsEfficient(int n){
        int i=2;
        while(i<=Math.sqrt(n)){
            while (n%i==0) {
                System.out.println(i);
                n /= i;
            }
            i++;
        }
        if(n>1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n1 = sc.nextInt();
        printPrimeFactors(n1);
        System.out.println();
        printPrimeFactorsEfficient(n1);
        sc.close();
    }
}
