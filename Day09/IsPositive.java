public class IsPositive{
    public static boolean isPositive(int a){
        return a>0;
    }
    public static void main(String[] args){
        boolean result = isPositive(-2);
        System.out.println(result);
    }
}