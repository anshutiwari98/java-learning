public class CountOccurrences{
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 70, 30, 90, 30};
        int num = 30;
        int count = 0;

        for(int i =0; i<numbers.length; i++){
            if(num == numbers[i]){
                System.out.println("Element found at index " + i );
               count = count+1;
            }         
        }
         System.out.println("no of occurrence is : " + count);
        
        }
    }