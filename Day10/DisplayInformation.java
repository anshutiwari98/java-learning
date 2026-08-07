/*Create a class named DisplayInformation. Create four overloaded methods named display().
Method 1:- Accepts one String parameter. - Displays the person's name.
Method 2:- Accepts one String parameter and one int parameter. - Displays the person's name and age.
Method 3:- Accepts one String parameter, one int parameter, and one String parameter. - Displays the person's name, age, and city.
Method 4:- Accepts one String parameter, one int parameter, one String parameter, and one double parameter.- Displays the person's name, age, city, and salary.
In the main() method:1. Call all four overloaded display() methods.2. Pass appropriate values to each method.3. Print the information in a readable format.
Example Output:

Name   : Anshu

Name   : Anshu
Age    : 25

Name   : Anshu
Age    : 25
City   : Bengaluru

Name   : Anshu
Age    : 25
City   : Bengaluru
Salary : 75000.0
*/

public class DisplayInformation{
    public static void display(String name){
        System.out.println("Name  :  "+name);
    }

    public static void display(String name, int age){
        System.out.println("Name  :  "+name);
        System.out.println("Age   :  "+age);
    }
    public static void display(String name, int age, String city){
        System.out.println("Name  :  "+name);
        System.out.println("Age   :  "+age);
        System.out.println("City  :  "+city);
    }
    public static void display(String name, int age, String city, double salary){
        System.out.println("Name    :  "+name);
        System.out.println("Age     :  "+age);
        System.out.println("City    :  "+city);
        System.out.println("salary  :  "+salary);
    }

    public static void main(String[] args){
        display("Anshu");
        display("Anshu", 28);
        display("Anshu", 28, "Bangalore");
        display("Anshu", 28, "Bangalore", 100000.67);

    }
}