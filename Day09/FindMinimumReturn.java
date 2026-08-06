/*import java.util.Scanner;
public class FindMinimumReturn{
    public static boolean minimum(int a, int b){
        return a>b;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        int number1 = sc.nextInt();
        System.out.print("Enter 2nd no : ");
        int number2 = sc.nextInt();

        boolean result = minimum(number1, number2);
        System.out.println(result);
    }
}*/

/*Create a method named minimum() that:Accepts two integer parameters.Returns the smaller of the two numbers.

In the main() method:
Take two numbers from the user using Scanner.Call the minimum() method.Store the returned value in a variable named result.
Print:Minimum number is : <result>*/

import java.util.Scanner;
public class FindMinimumReturn{
    public static int minimum(int a, int b){
        if(a<b){
            return a;
        }
        else{return b;}
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        int number1 = sc.nextInt();
        System.out.print("Enter 2nd no : ");
        int number2 = sc.nextInt();

        int result = minimum(number1, number2);
        System.out.println("Minimum no is : " +result);
    }
}