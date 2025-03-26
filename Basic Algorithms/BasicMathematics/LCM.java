import java.util.Scanner;

// Time Complexity = O(log(min(a,b)))
// Space Complexity = O(1)

public class LCM {

    static int hcf(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }

    //brute force method
    // O( ( n1*n2 )- max(n1,n2) )
    static int lcm(int n1 , int n2){
        int i = Math.max(n1,n2);
        while (!(i%n1==0 && i%n2==0)) {
            i++;
        }
        return i;
    }

    //brute force different approach
    // O( (n1*n2)-max(n1,n2) )
    static int differentApproach(int n1, int n2){
        int i = Math.max(n1, n2);
        while(n2%n1 != 0){
            n2 += i;
        }
        return n2;
    }

    //optimized approach uses [ lcm(a,b) * hcf(a,b) = a * b ]
    // O(log(min(a,b)))
    static int optimizedLCM(int a, int b){
        return (a*b/hcf(a,b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        System.out.print("number 1 : ");
        int n1 = scan.nextInt();
        System.out.print("number 2 : ");
        int n2 = scan.nextInt();
        System.out.println("The LCM is : " + optimizedLCM(n1, n2));
        System.out.println("the lcm in different approach is :"+ differentApproach(n1, n2));
        scan.close();
    }
}
