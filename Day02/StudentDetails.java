import java.util.Scanner;

public class StudentDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your city:");
        String city = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.println("-------------------------");
        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);

    }
}