import java.util.Scanner;
public class InterviewEligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Are you graduated? (true/false) : ");
        boolean GraduationStatus = sc.nextBoolean();
        if(age>= 18){
            System.out.println("Age Verified");

            if(GraduationStatus== true){
                System.out.println("Eligible for Interview");
            }
        }
        System.out.println("Thank you!");
    }
}