/*Create a method named maximum() that:Accepts two integer parameters.Returns the larger of the two numbers.

In the main() method:Call the method with:maximum(10, 20)
Store the returned value in a variable named result.*/

public class MaximumReturn{
    public static int maximum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
            }
    }
    public static void main(String[] args){
        int result = maximum(10,20);
        System.out.println("Maximum number is : "+result);
    }
}