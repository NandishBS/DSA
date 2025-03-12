import java.util.Scanner;

public class TrailingZeros {
    static int trailingZeros(int n){
        int i=1;
        int res = 0;
        while(true){
            int temp = (int) (n / (Math.pow(5, i)));
            if(temp!=0){
                res += temp;
                i++;
            }
            else{
                return res;
            }
        }
    }

    static int trailingZeros2(int n){
        int res = 0;
        int powOf5 = 5;
        while(n >= powOf5){
            res += (int)n/(powOf5);
            powOf5 *= 5;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("the number of trailing zeros : "+ trailingZeros(n));
        System.out.println(trailingZeros2(n));
        sc.close();
    }
}
