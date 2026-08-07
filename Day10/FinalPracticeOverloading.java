/*Create a class named FinalPracticeOverloading.Create the following overloaded methods named calculate().
Method 1:- Accepts one int parameter. - Returns the square of the number.
Method 2:- Accepts two int parameters.- Returns the addition of the two numbers.
Method 3:- Accepts three int parameters.- Returns the average of the three numbers.- The average should be returned as a double.
Method 4:- Accepts two double parameters.- Returns the multiplication of the two numbers.
Method 5:- Accepts one String parameter.- Prints:"Hello <name>"
In the main() method:
1. Call calculate(5) .2. Call calculate(10, 20) 3. Call calculate(10, 20, 30) 4. Call calculate(5.5, 2.0)5. 
Call calculate("Anshu").Print all returned values with meaningful messages.
store the returned value.
Example Output :
Square               : 25
Addition             : 30
Average              : 20.0
Multiplication       : 11.0
Hello Anshu
*/

public class FinalPracticeOverloading{
    public static int calculate(int a){
        int square = a*a;
        return square;
    }
    public static int calculate(int a, int b){
        int add = a+b;
        return add;
    }
    public static double calculate(int a, int b, int c){
        double avg = (a+b+c)/3;
        return avg;
    }
    public static double calculate(double a, double b){
        double mul = a*b;
        return mul;
    }
    public static void calculate(String name){
        System.out.println("Hello "+ name);
        System.out.println("................");
    }

    public static void main(String[] args){
        int result1 = calculate(5);
        int result2 = calculate(10, 20);
        double result3 = calculate(10, 20, 30);
        double result4 = calculate(5.5, 2.0);
        calculate("Anshu");

        System.out.println("Square               : "+result1);
        System.out.println("Addition             : "+result2);
        System.out.println("Average              : "+result3);
        System.out.println("Multiplication       : "+result4);



    }
}