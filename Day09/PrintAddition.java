/* Create a method named printAddition() that accepts two integer parameters.
Inside the method:
Calculate the sum of the two numbers.
Store the result in a local variable named sum.
Print the result in the following format:
Addition of 10 and 20 is : 30  */

public class PrintAddition{
    public static void printAddition(int a, int b){
        int sum = a+b;
        System.out.println("Addition of " +a+ " and "+b+" is : " +sum);
    }

    public static void main(String[] args){
        printAddition(10, 20);
        printAddition(25, 15);
        printAddition(100, 200);
        printAddition(7, 8);
    }
}