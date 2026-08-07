/*Create a class named MethodResolutionDemo.Create the following overloaded methods named test().
Method 1:- Accepts one int parameter.- Prints: "test(int) called"
Method 2:- Accepts one long parameter. - Prints: "test(long) called"
Method 3:- Accepts one float parameter. - Prints:   "test(float) called"
Method 4:- Accepts one double parameter. - Prints:   "test(double) called"
In the main() method, call the methods using the following values:
1. test(10); 2. test(10L); 3. test(10.5f); 4. test(10.5); 5. test('A');
Print the output and observe which overloaded method Java selects for each call.
Do not change the arguments. After observing the output, write comments in your code explaining WHY Java selected each overloaded method.
*/

public class MethodResolutionDemo{
    public static void test(int a){
        System.out.println("test(int) called");
    }

    public static void test(long a){
        System.out.println("test(long) called");
    }
    public static void test(float a){
        System.out.println("test(float) called");
    }
    public static void test(double a){
        System.out.println("test(double) called");
    }
    public static void main(String[] args){
        test(10);
        test(10L);
        test(10.5f);
        test(10.5);
        test('A');
    }
}