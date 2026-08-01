public class ArraySum{
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i<=numbers.length-1; i++){
            sum += numbers[i];
            
        }
        System.out.println(sum);
    }
}