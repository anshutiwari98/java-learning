/*Create a method named add() that: Accepts two integer parameters. Calculates their sum.Returns the sum to the caller instead of printing it.
In the main() method: Call the add() method. Store the returned value in a variable named result.Print the result. "Addition is : 30" */

public class AdditionReturn{
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args){
        int result = sum(4,6);
        System.out.println(result);
    }
}