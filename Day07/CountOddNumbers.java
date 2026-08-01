public class CountOddNumbers{
    public static void main(String[] args){
        int numbers[] = {20, 68, 77, 23, 60};
        int count = 0;
         for(int i = 0; i<numbers.length; i++){
            if(numbers[i]%2==1){
                count++;
            }
         }
         System.out.println("Count of odd no is : " + count);
    }
}