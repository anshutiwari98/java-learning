import java.util.Scanner;
class ArrayMinimumUserInput{
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Array : ");
        int length = sc.nextInt();
        int [] numbers = new int [length];
        System.out.print("Enter first element of the array : ");
        numbers[0] = sc.nextInt();
        int min = numbers[0];

        for(int i = 1; i<numbers.length; i++){
            System.out.print("Enter " + (i+1) + " element : ");
            numbers[i] = sc.nextInt();
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.print("Minimum no is : " + min);

        sc.close();
    }
}