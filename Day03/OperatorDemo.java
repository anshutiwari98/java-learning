public class OperatorDemo{
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 5;
        int c = 10;
        System.out.print("Addition : " );
        System.out.println(num1+num2);

        System.out.print("Subtraction : " );
        System.out.println(num1-num2);

        System.out.print("Multiplication  : " );
        System.out.println(num1*num2);

        System.out.print("Division : " );
        System.out.println(num1/num2);

        System.out.print("Remainder : " );
        System.out.println(num1%num2);

        System.out.println(c += 5);
        System.out.println(c -= 3);
        System.out.println(c *= 2);
        System.out.println(c /= 4);
        System.out.println(c %= 3);

    }
}