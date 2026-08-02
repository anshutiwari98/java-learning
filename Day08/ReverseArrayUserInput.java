import java.util.Scanner;
public class ReverseArrayUserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter length of the Array : ");
        int length = sc.nextInt();
        int [] numbers = new int[length];
        int temp;

        System.out.println("Enter elemnets of the array : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(""Enter element " + (i + 1) + " : "");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Below is the array : ");
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Reversed array is :  ");
        for(int i = 0; i<numbers.length/2; i++){
            temp = numbers[i];
            numbers[i]= numbers[numbers.length-1-i];
            numbers[length-1-i]=temp;
           
        }
         for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
         }
        
    }
}