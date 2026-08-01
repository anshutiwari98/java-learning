public class LinearSearch{
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        int num = 100;
        int i;
        boolean found = false;

        for(i =0; i<numbers.length; i++){
            if(num == numbers[i]){
                System.out.println("Element found at index " + i );
                found = true;   
                break;
            }
                       
        }
        if (!found) {
    System.out.println("Element not found");
}
        }
    }
