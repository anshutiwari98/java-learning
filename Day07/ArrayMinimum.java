public class ArrayMinimum{
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        int min = numbers[0];
        int i;
        for( i = 1; i<numbers.length; i++){
            
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.print("Minimum no is : " + min);
}
}