//Take a number n from the user. Print all odd numbers from 1 to n.


import java.util.Scanner;
public class OddNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();



        for(int i = 1; i<=num; i+=2){
                System.out.println(i);

        
            
        }

        
    }
}