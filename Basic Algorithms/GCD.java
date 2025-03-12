import java.util.Scanner;

public class GCD {
    static int gcd(int n1, int n2){
        int min = n1>n2 ? n2 : n1;
        for(int i=min; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = scan.nextInt();
        System.out.println("The GCD is " + gcd(num1, num2));
        scan.close();
    }
}
