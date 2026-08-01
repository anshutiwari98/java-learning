public class ReverseArray{
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        for(int i = 0; i<numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[(numbers.length-1)-i];
            numbers[(numbers.length-1)-i]= temp;
            
        }
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }
    }

}