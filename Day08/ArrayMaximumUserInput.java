import java.util.Scanner;

public class ArrayMaximumUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // Take first element separately
        System.out.print("Enter element 1: ");
        numbers[0] = sc.nextInt();

        // Assume first element is the maximum
        int num = numbers[0];

        // Start from index 1 because index 0 is already processed
        for (int i = 1; i < numbers.length; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > num) {
                num = numbers[i];
            }
        }

        System.out.println("\nFinal Array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nMaximum number of the array is: " + num);

        sc.close();
    }
}