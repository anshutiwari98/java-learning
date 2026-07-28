//Factorial

import java.util.Scanner;

public class FactorialCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
    
      
        for(int i =num; i>=1; i--){
            
           fact = fact*i;
        }
        System.out.print("factorial of " +num+ " is : " + fact);   

    }
}