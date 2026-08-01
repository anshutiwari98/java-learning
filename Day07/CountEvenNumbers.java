public class CountEvenNumbers{
    public static void main(String[] args){
        int [] numbers = {10, 20, 35, 40, 57};
        int count = 0;
        for(int i = 0; i<numbers.length; i++){
            
            if(numbers[i]%2==0){
                count++;
            }
        }
        System.out.print("Count of even no is : " + count);
}
}