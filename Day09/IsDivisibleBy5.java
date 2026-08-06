import java.util.Scanner;
public class IsDivisibleBy5{
    public static boolean isDivisibleBy5(int num){
        return num%5==0;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int number = sc.nextInt();

        boolean result = isDivisibleBy5(number);
        System.out.println(result);
    }
}