//Take a number n from the user. Print all even numbers from 1 to n.


import java.util.Scanner;
public class EvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();



        for(int i = 0; i<=num; i++){
            if(i%2==0){
                System.out.println(i);

            }
            
        }

        
    }
}