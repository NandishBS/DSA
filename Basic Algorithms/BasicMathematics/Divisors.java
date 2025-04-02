import java.util.Scanner;

public class Divisors {
    // BruteForce Method
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    static void printDivisors(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(n);
    }

    // Time Complexity = O(root(n))
    // Space Complexity = O(1)
    static void EfficientApproach(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                if((double)n/i == i){
                    System.out.println(i+" ");
                }
                else{
                    System.out.print(i + " " + (n/i) + " ");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        printDivisors(n);
        System.out.println();
        EfficientApproach(n);
        sc.close();
    }
}
