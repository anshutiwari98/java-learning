/*Create a method named square() that:Accepts one integer parameter.Calculates the square of the number.Returns the square.
In the main() method:
Call the method with 8.Store the returned value in a variable named result.Print the result in the following format:*/

public class SquareReturn{
    public static int square(int num){
    int b = num*num;
    return b;
    }

    public static void main(String[] args){
        int result = square(8);
        System.out.println("Square is : " +result);
    }
}