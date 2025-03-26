import java.util.Scanner;

public class PrimeNumber {

    // it starts from 2 and goes till n/2
    // time complexity is O(n)
    // space complexity is O(1)
    static boolean bruteforce(int n1){
        if(n1 < 2){
            return false;
        }
        for(int i=2; i<=n1/2 ; i++){
            if(n1%i==0){
                return false;
            }
        }
        return true;
    }


    // better approch is for every number n, (root of n) is where we find its first factor so we can go from 2 to root n
    // Time Complexity = O(root(n))
    // Space Complexity = O(1)
    static boolean betterapproach(int n1){
        if(n1 < 2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n1) ; i++){
            if(n1%i==0){
                return false;
            }
        }
        return true;
    }
    

    // this approach is even better than the previous one because it goes from 5 to root(n), and also jump by 6
    // Time Complexity = O(root(n))
    // Space Complexity = O(1)
    static boolean efficientApproach(int n){ 
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5 ; i*i<=n; i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n1 = sc.nextInt();
        System.out.println(bruteforce(n1));
        System.out.println(betterapproach(n1));
        System.out.println(efficientApproach(n1));
        sc.close();
    }    
}
