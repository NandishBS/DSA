import java.util.Scanner;

public class Counter {
    // Time Complexity = O(log10(n))
    // Space Complexity = O(1)
    static int countDigits(int n){
            int count = 0;
            while(n>0){
                n = n / 10;
                count++;
            }
            return count;
        }
    
        // Time Complexity = O(1)
        // Space Complexity = O(1)
        static int optimizedSolution(int n){
            return ((int)Math.log10((double)n) + 1);
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println(countDigits(n));
            System.out.println(optimizedSolution(n));
            sc.close();
    }
}
