public class ArrayMaximum{
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        int num = numbers[0];
        int i;
        for( i = 1; i<numbers.length; i++){
            
            if(num<numbers[i]){
                num = numbers[i];
            }
        }
        System.out.print("Maximum no is : " + num);
}
}