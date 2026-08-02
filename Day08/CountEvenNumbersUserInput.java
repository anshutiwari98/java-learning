import java.util.Scanner;
public class CountEvenNumbersUserInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Array : ");
        int length = sc.nextInt();
        int numbers[] = new int[length];
        int count = 0;
        for(int i = 0; i<numbers.length; i++){
            System.out.print("Enter " + i + "element : ");
            numbers[i] = sc.nextInt();
            if(numbers[i]%2==0){
                count++;
            }
        }
        System.out.println("Count of even no is : " + count);

    }
}