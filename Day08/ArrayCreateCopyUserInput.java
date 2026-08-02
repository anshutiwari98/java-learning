import java.util.Scanner;
public class ArrayCreateCopyUserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter length of the Array : ");
        int length = sc.nextInt();
        int [] numbers = new int[length];
        int [] copyNumbers = new int[numbers.length];

        System.out.println("Enter elemnets of the array : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.print("Enter element " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Below is the array : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for(int i = 0; i<numbers.length; i++){
            
            copyNumbers[i]= numbers[i];
           
        }
        System.out.println("Copied Array Elements:");
         for(int i = 0; i<numbers.length; i++){
            System.out.print(copyNumbers[i]+ " ");
         }
        
    }
}