/*Create a method named absoluteValue() that: Accepts one integer parameter. Returns the absolute value of the given number.
In the main() method:Take one integer input from the user using Scanner. Call the absoluteValue() method.
Store the returned value in a variable named result.
Print: Absolute value is : <result> */

import java.util.Scanner;
public class AbsoluteValue{
    public static int absoluteValue(int a){
        if(a>=0){
            return a;
        }
        else{ return -a;}

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int num = sc.nextInt();
        int result = absoluteValue(num);
        System.out.print("Absolute value is : "+result);
    }
}