/*Create a class named EmployeeSalary. Create four overloaded methods named calculateSalary().
Method 1: - Accepts one int parameter representing the basic salary.- Returns the basic salary.
Method 2: - Accepts two int parameters:- basic salary - bonu - Returns the total salary (basic salary + bonus).
Method 3:- Accepts three int parameters: - basic salary - bonus - incentive- Returns the total salary (basic salary + bonus + incentive).
Method 4:- Accepts four int parameters:- basic salary- bonus- incentive- tax deduction- Returns the final salary after deducting tax.
Formula: Final Salary = Basic Salary + Bonus + Incentive - Tax
In the main() method:1. Call all four overloaded methods.2. Store the returned values in variables.3. Print the results with meaningful messages.
Example Output:
Basic Salary                    : 50000
Salary with Bonus               : 55000
Salary with Bonus & Incentive   : 62000
Final Salary after Tax          : 57000
*/

public class EmployeeSalary{
    public static int calculateSalary(int basicSalary){
        return basicSalary;
    }
    public static int calculateSalary(int bsicSalary, int bonus){
        int totalSalary = bsicSalary + bonus;
        return totalSalary;
    }
    public static int calculateSalary(int bsicSalary, int bonus, int incentive){
        int totalSalary = bsicSalary + bonus + incentive;
        return totalSalary;
    }
    public static int calculateSalary(int bsicSalary, int bonus, int incentive, int tax){
        int finalSalary = bsicSalary + bonus + incentive - tax;
        return finalSalary;
    }

    public static void main(String[] args){
        int result1 = calculateSalary(50000);
        int result2 = calculateSalary(50000, 2000);
        int result3 = calculateSalary(50000, 2000, 12000);
        int result4 = calculateSalary(50000, 20000, 12000, 5000);

        System.out.println("Basic Salary                    : "+result1);
        System.out.println("Salary with Bonus               : "+result2);
        System.out.println("Salary with Bonus & Incentive   : "+result3);
        System.out.println("Final Salary after Tax          : "+result4);
    }
}