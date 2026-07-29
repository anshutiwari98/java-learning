//

public class FactorialWhile{
    public static void main(String[] args){
        int i = 1;
        int factorial = 1;
        while(i<=20){
            factorial = factorial * i;
            i++;
            
        }
        System.out.println(factorial);
    }
}