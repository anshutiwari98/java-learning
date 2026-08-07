/*Create a class named TemperatureConverter.Create two overloaded methods named convert().

Method 1:- Accepts one double parameter representing temperature in Celsius.- Converts it to Fahrenheit.
- Formula:  Fahrenheit = (Celsius × 9 / 5) + 32 -- Returns the Fahrenheit value.
Method 2:- Accepts one double parameter and one boolean parameter.- The double parameter represents temperature in Fahrenheit.- The boolean parameter indicates that the conversion should be from Fahrenheit to Celsius.
- Formula:  Celsius = (Fahrenheit - 32) × 5 / 9 -- Returns the Celsius value.
In the main() method:1. Convert 25°C to Fahrenheit. 2. Convert 98.6°F to Celsius. 3. Store the returned values in variables. 4. Print the results with meaningful messages.
Example Output:25.0 Celsius in Fahrenheit : 77.0,, 98.6 Fahrenheit in Celsius : 37.0
*/
public class TemperatureConverter{
    public static double convert(double Celsius){
        double Fahrenheit = (Celsius * 9 / 5) + 32;
        return Fahrenheit;

    }

    public static double convert(double Fahrenheit, boolean a){
        if(a){
                    
            double Celsius = (Fahrenheit - 32) * 5 / 9;
            return Celsius;
        }
        else{
            return Fahrenheit;
        }

    }
    public static void main(String[] args){
        double result1= convert(25.0);
        double result2 = convert(98.6, true);

        System.out.println("25.0 Celsius in Fahrenheit : "+result1);
        System.out.println("98.6 Fahrenheit in Celsius : "+result2);
    }

}