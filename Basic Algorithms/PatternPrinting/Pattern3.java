import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nuber : ");
        int n = sc.nextInt();
        sc.close();
        int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%02d ",number);
                number++;
            }
            System.out.println();
        }
    }
}
