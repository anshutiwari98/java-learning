//Create a method named greet(). The method should print the following message: "Good Morning" 
//Now, from the main() method, call the greet() method 5 times.

public class GreetMultipleTimes{
    public static void greet(){
        System.out.println("Good Morning");
    }
    
    public static void main(String[] args){
        greet();
        greet();
        greet();
        greet();
        greet();
    }
}