import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        int res = 1;
        while(n>0){
            res *= n;
            n--;
        }
        return res;
    }

    static int trailingZeros(int n){
        int count = 0;
        while(true){
            if(n%10 == 0){
                n /= 10;
                count++;
            }
            else{
                return count;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println("trailing zeros : " + trailingZeros(factorial(n)));
        sc.close();
    }
}