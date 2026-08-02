import java.util.Scanner;
public class CountOccurrencesUserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length  of the array : ");
        int length = sc.nextInt();
        int [] numbers = new int [length];
        int count=0;

        System.out.println("Enter elements of array : ");
        for(int i =0; i<numbers.length; i++){
            System.out.print("Enter element "+(i+1) + " : ");
            numbers[i] = sc.nextInt();
            
        }
        System.out.println("Below is the Array Elements ");
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            
        }
        System.out.print("Enter the number to count occurrences:");
        int num = sc.nextInt();
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]==num){
                count++;
            }
            
        }
        System.out.println("Number of occurrence of " +num+ " is : " + count);
    }
}