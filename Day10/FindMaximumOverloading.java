/*Create a class named FindMaximumOverloading.Create three overloaded methods named max().
Method 1:- Accepts two int parameters.- Returns the larger integer.
Method 2:- Accepts three int parameters.- Returns the largest integer.
Method 3:- Accepts two double parameters.- Returns the larger double value.
In the main() method:1. Call all three overloaded methods.2. Store the returned values in variables.3. Print the results with meaningful messages.
Example Output:Maximum of two integers   : 20 Maximum of three integers : 45 Maximum of two doubles    : 18.7
*/
public class FindMaximumOverloading{
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static int max(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        }
        else if (b>=a && b>=c){
            return b;
        }
        else{
            return c;
        }

    }
    public static double max(double a, double b){
        if(a>=b){
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String[] args){
        int result1 = max(7, 2);
        int result2 = max(7, 2, 7);
        double result3 = max(1.7, 2.5);

        System.out.println("Maximum of two integers     : "+result1);
        System.out.println("Maximum of three integers   : "+result2);
        System.out.println("Maximum of two double   : "+result3);
    }

}