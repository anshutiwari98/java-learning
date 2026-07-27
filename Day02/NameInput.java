import java.util.Scanner;

public class NameInput{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your City");
    String city = sc.nextLine();
    System.out.println("Enter Your name");
    String name = sc.nextLine();
    System.out.println("Hello  " + name);
    System.out.println("you live in " + city);


}
}