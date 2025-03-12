// take a range of numbers and print all the odd numbers in the range in right angle triangle pattern

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumbersRATP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input of range
        System.out.println("Enter the range : ");
        System.out.print("from : ");
        int x = sc.nextInt();
        System.out.print("to : ");
        int y = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        //storing the odd numbers
        for(int i=x; i<=y;i++){
            if(i%2!=0){
                numbers.add(i);
            }
        }

        //logic for printing the star
        int row = 0;
        int i = 0;
        while (numbers.size()-i >= row+1) {
            for(int j=0; j<=row; j++){
                System.out.print(numbers.get(i) + " ");
                i++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
