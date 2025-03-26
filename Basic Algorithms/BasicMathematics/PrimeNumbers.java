import java.util.Scanner;

class PrimeNumbers{

    // Time Complexity is O(root(n)*log(log(n)))
    // Space Complexity is O(n)
    static void sieveOfEratosthenesAlgoritm(int n){
        boolean array[] = new boolean[n+1];

        for(int i = 2; i<=Math.sqrt((double)n); i=i+1){
            
            if(array[i]==false){
                
                for(int j=i*i;j<=n;j=j+i){
                    array[j] = true;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(array[i] == false){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The Prime Number List is :");
        sieveOfEratosthenesAlgoritm(n);

        sc.close();
    }
}