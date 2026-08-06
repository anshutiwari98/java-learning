/*Create a method named printSquare() that accepts one integer parameter.
The method should print the square of the given number*/

public class PrintSquare{
    public static void printSquare(int num){
        int square = num*num;
        System.out.println("Square of " +num+" is : "+square);
        
    }

    public static void main(String[] args){
        printSquare(5);
        printSquare(10);
        printSquare(7);
        printSquare(12);
        
    }
}