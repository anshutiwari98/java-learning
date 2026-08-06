/*Create a method named isEven() that:
Accepts one integer parameter.Returns true if the number is even.Returns false if the number is odd.

In the main() method:Call the method with 8.Store the returned value in a variable named result.
Print the result. "true"*/

public class IsEven{
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{ 
            return false;
        }
    }
    public static void main(String[] args){
        boolean result = isEven(87);
        System.out.println(result);
    }
}