public class ArrayCreateCopy{
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        int [] copyNumbers = new int[numbers.length];
        for(int i = 0; i<numbers.length; i++){
            copyNumbers[i] = numbers[i];
        }
        System.out.println("Original Array:");
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            }
            System.out.println("Copied Array :");
            for(int i = 0; i<numbers.length; i++){
            System.out.println(copyNumbers[i]);
        } 
    }
}