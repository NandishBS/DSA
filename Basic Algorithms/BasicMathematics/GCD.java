import java.util.Scanner;

// Time Complexity = O(log(min(a,b)))
// Space Complexity = O(1)

public class GCD {
    //using the brute force approach
    // O(min(n1,n2))
    static int gcd(int n1, int n2){
        int min = n1>n2 ? n2 : n1;
        for(int i=min; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }

    //using the euclid method by replacing the larger number with difference
    // O(max(n1,n2))
    static int euclidGCD(int n1, int n2){
        while (n1 != n2) {
            if(n1>n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    //using the optimized euclid method by replacing the larger number with remainder
    // O(log(min(n1,n2)))
    static int optimizedEuclidGCD(int n1, int n2){
        while(n1!=0 && n2!=0){
            if(n1>n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        }else{
            return n1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = scan.nextInt();
        System.out.println("The GCD is " + optimizedEuclidGCD(num1, num2));
        scan.close();
    }
}