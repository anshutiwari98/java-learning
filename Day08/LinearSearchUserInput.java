import java.util.Scanner;

public class LinearSearchUserInput{
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Array : ");
        int length = sc.nextInt();
        int numbers [] = new int[length];
        
        boolean found =false;
        for(int i = 0; i<numbers.length; i++){
            System.out.print("Enter no " + (i+1) + " Element : ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter no to search in array : ");
        int num = sc.nextInt();
        System.out.println("Element of array is : ");
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
                       
        }

        for(int i =0; i<numbers.length; i++){
            if(numbers[i]==num){
                System.out.println("Number found at : "+i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Number not found");
        }

        
    
    }
}


