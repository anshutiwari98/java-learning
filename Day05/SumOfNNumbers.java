//Take a number n from the user. Calculate the sum of numbers from 1 to n.

import java.util.Scanner;

public class SumOfNNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += i;    
        }
        System.out.print("Sum is : " + sum);

    }
}