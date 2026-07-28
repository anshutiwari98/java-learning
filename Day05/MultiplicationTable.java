//

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int mul;

        for(int i =1; i<=10; i++){
            mul = num * i; 
            System.out.println(num + " * " + i + " = " + mul );   
        }
       

    }
}