/*Create a method named largest() that: Accepts three integer parameters.
Returns the largest of the three numbers.
In the main() method:Take three integer inputs from the user using Scanner.Call the largest() method.
Store the returned value in a variable named result.Print:Largest number is : <result>*/

import java.util.Scanner;
public class FindLargestOfThree{
    public static int largest(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{return c;}      
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3 : ");
        int num3 = sc.nextInt();
        int result = largest(num1, num2, num3);
        System.out.println("Largest number is : "+result);

    }
}