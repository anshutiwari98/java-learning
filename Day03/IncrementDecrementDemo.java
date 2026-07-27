public class IncrementDecrementDemo{
    public static void main(String[] args){
       int a = 10;

// Post Increment
System.out.println("------------------------------------------");
System.out.println("Post Increment");
System.out.println("------------------------------------------");
System.out.println(a++);
System.out.println(a);

// Reset
a = 10;

// Pre Increment
System.out.println("------------------------------------------");
System.out.println("Pre Increment");
System.out.println("------------------------------------------");
System.out.println(++a);
System.out.println(a);

// Reset
a = 10;

// Post Decrement
System.out.println("------------------------------------------");
System.out.println("Post Decrement");
System.out.println("------------------------------------------");
System.out.println(a--);
System.out.println(a);

// Reset
a = 10;

// Pre Decrement
System.out.println("------------------------------------------");
System.out.println("Pre Decrement");
System.out.println("------------------------------------------");
System.out.println(--a);
System.out.println(a);


System.out.println("----- Post Increment -----");


int b = 10;
System.out.println("Initial Value : " + b);
System.out.println("a++           : " + b++ );
System.out.println("Final Value   : " + b);
    }
}