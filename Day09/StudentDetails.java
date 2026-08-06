/*Create a method named studentDetails() that accepts two parameters:
Student Name (String)
Student Age (int)
Inside the method, print the student details in the following format:
Student Name : Anshu
Student Age  : 24
Leave one blank line after printing each student's details.*/

public class StudentDetails{
    public static void studentDetails(String name, int age){
        System.out.println("Student Name : "+name);
        System.out.println("Student Age : "+age);
        System.out.println("");
    }

    public static void main(String[] args){
        studentDetails("Anshu", 24);
        studentDetails("Rahul", 22);
        studentDetails("Java", 30);
    }
}