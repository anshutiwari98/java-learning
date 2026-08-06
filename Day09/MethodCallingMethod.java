/* 
Create a method named square() that:- Accepts one integer parameter.- Returns the square of the given number.

Create another method named cube() that:- Accepts one integer parameter.- Calls the square() method to calculate the square of the number.- Multiplies the returned square by the same number.
- Returns the cube of the number.

In the main() method:- Take one integer input from the user using Scanner.- Call the cube() method.- Store the returned value in a variable named result.
- Print the result in the following format:

Cube is : <result>
*/

import java.util.Scanner;
public class MethodCallingMethod{
    public static int square(int a){
        int b = a*a;
        return b;
    }
    public static int cube(int a){
        return square(a)*a;
         
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int num = sc.nextInt();
        int result = cube(num);
        System.out.println("Cube is : " +result);

    }

}
