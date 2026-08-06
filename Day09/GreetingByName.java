/*Create a method named greet() that accepts one String parameter representing a person's name.
Inside the method, print:
Hello <name>
where <name> is the value passed to the method.
From the main() method, call the greet() method three times using different names. */

public class GreetingByName{
    public static void greet(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args){
        greet("Anshu");
        greet("Rahul");
        greet("Java");
    }
}