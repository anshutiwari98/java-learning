public class IsEligibleToVote{
    public static boolean isEligibleToVote(int age){
        return age>=18;
    }
    public static void main(String[] args){
        boolean result = isEligibleToVote(18);
        System.out.println(result);
    }
}