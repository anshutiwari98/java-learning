import java.util.Scanner;

public class EvenOddChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer number : ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.print(result);


    }
}