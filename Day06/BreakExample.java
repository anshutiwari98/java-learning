//Print numbers from 1 to 10, but stop when the number becomes 6.

public class BreakExample{
    public static void main(String[] args){
        for(int i = 1; i<=10; i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
    }
}