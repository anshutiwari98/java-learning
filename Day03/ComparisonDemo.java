public class ComparisonDemo{
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("-----------------------------------------");
        System.out.println("Relational Operator");
        System.out.println("-----------------------------------------");

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("-----------------------------------------");
        System.out.println("Logical Operator");
        System.out.println("-----------------------------------------");

        System.out.println("(a < b) && (a == 10) : " + ((a < b) && (a == 10)));
        System.out.println("(a > b) && (a == 10) : " + ((a > b) && (a == 10)));
        System.out.println("(a > b) || (a == 10) : " + ((a > b) || (a == 10)));
        System.out.println("(a > b) || (a != 10) : " + ((a > b) || (a != 10)));
        System.out.println("!(a == b) : " + !(a == b));
        System.out.println("!(a < b) : " + !(a < b));
    }
}