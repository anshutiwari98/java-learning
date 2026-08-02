import java.util.Scanner;

public class ArraySumUserInput{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int [] numbers = new int [size];
        int sum = 0;
        for(int i =0; i<numbers.length; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("sum of the element is : " + sum);
    }

}      