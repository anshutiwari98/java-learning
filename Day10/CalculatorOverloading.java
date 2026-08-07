/*Create a class named CalculatorOverloading.
Create four overloaded methods named calculate().
Method 1:- Accepts two int parameters.- Returns their addition.
Method 2:- Accepts three int parameters.- Returns their addition.
Method 3:- Accepts two double parameters.- Returns their multiplication.
Method 4:- Accepts one int parameter.- Returns the square of the number.
In the main() method:1. Call all four overloaded methods.2. Store the returned values in appropriate variables.3. Print all the results with meaningful messages.
Example Output:
Addition of two integers   : 30
Addition of three integers : 60
Multiplication of doubles  : 15.75
Square of number           : 49
*/

public class CalculatorOverloading{
    public static int calculate(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int calculate(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public static double calculate(double a, double b){
        double product = a*b;
        return product;
    }
    public static int calculate(int a){
        int square = a*a;
        return square;
    }
    public static void main(String [] args){
        int result1 = calculate(4,5);
        int result2 = calculate(4,5,8);
        double result3 = calculate(4.5, 9.5);
        int result4 = calculate(5);

        System.out.println("Addition of two integers   : " +result1);
        System.out.println("Addition of three integers : " +result2);
        System.out.println("Multiplication of doubles  : " +result3);
        System.out.println("Square of number           : " +result4);
    }
}