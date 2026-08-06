/* add()
subtract()
multiply()
divide() */

import java.util.Scanner;
public class CalculatorReturn{
    public static int add(int a, int b){
        int c = a+b;
        return c;
    }
    public static int subtract(int a, int b){
        int c = a-b;
        if(c>=0){
            return c;
        }
        else { return -c;}
    }
    public static int multiply(int a, int b){
        int c = a*b;
        return c;
    }
    public static int divide(int a, int b){
        int c =a/b;
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd no : ");
        int num2 = sc.nextInt();
        int sum = add(num1, num2);
        int diff = subtract(num1, num2);
        int product = multiply(num1, num2);
        int quotient = divide(num1, num2);

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + diff);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
    }
}