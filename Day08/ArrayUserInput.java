import java.util.Scanner;

public class ArrayUserInput{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        for(int i =0; i<numbers.length; i++){   
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = sc.nextInt();
            numbers[i] = element;
        }
        System.out.println("Final Array is");
        for(int i =0; i<numbers.length; i++){   
            System.out.println(numbers[i]);
        }
        
    }
}