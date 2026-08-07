/* Create a class named AdditionOverloading.Create three overloaded methods named add().
Method 1:- Accepts two int parameters.- Returns the sum of the two integers.
Method 2:- Accepts three int parameters.- Returns the sum of the three integers.
Method 3:- Accepts two double parameters.- Returns the sum of the two decimal numbers.
In the main() method:1. Call add() with two integers.2. Call add() with three integers.3. Call add() with two double values.4. Store each returned value in an appropriate variable.5. Print all the results in the following format:
Addition of two integers   : <result>Addition of three integers : <result> Addition of two doubles    : <result>
*/

public class AdditionOverloading{
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static int add(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public static double add(double a, double b){
        double sum = a+b;
        return sum;
    }

    public static void main(String[] args){
        int result1 = add(4, 5);
        int result2 = add(5, 6, 7);
        double result3 = add(5.0, 6.0);

        System.out.println("Addition of two integers   : " +result1);
        System.out.println("Addition of three integers : " +result2);
        System.out.println("Addition of two doubles    : " +result3);

    }
    
}