/* /*
Create a method named isPalindrome() that:- Accepts one integer parameter.- Checks whether the given number is a palindrome.- Returns true if the number is a palindrome. Returns false otherwise.

A palindrome number is a number that remains the same when its digits are reversed.Examples:
121  -> true
1331 -> true
123  -> false
45654 -> true

In the main() method: Take one integer input from the user using Scanner.Call the isPalindrome() method.Store the returned value in a variable named result.Print the result in the following format:
Palindrome : <result>
*/

import java.util.Scanner;
public class IsPalindromeNumber{
    public static boolean isPalindrome(int a){
        int original = a;
        int reverse = 0;
        while(a>0){
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a/10;
        }
        return original == reverse;
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to check pelindrome : ");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        System.out.println("Palindrome : " + result);
    }
}