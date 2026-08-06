import java.util.Scanner;
public class FinalPracticeMethods{
    public static int square(int num){
        int a = num*num;
        return a;
    }
    public static int cube(int num){
        int a = square(num)*num;
        return a;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static int maximum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second no : ");
        int num2 = sc.nextInt();
        
        int squareResult = square(num1);
        int cubeResult = cube(num1);
        boolean evencheck = isEven(num1);
        int max = maximum(num1, num2);

        System.out.println("Square of first number : "+ squareResult);
        System.out.println("Cube of first number : "+ cubeResult);
        System.out.println("First number is even   :" + evencheck);
        System.out.println("Maximum number         : "+ max);

    }


}