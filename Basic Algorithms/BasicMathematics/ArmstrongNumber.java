import java.util.Scanner;

public class ArmstrongNumber {
    
    // Time Complexity = O(log10(n))
    // Space Complexity = O(1)
    static boolean getArmstrongNumber(int n){
        int n1 = n;
        int digits = (int)Math.log10(n) + 1;
        int res = 0;
        while(n>0){
            int unitdigit = n%10;
            n/=10;
            res = res + (int)Math.pow(unitdigit, digits);
        }
        if(res == n1){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println(getArmstrongNumber(n));
            sc.close();
    }
}
