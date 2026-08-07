public class AreaCalculator{
    public static double area(double radius){
        double Area = 3.14*radius*radius;
        return Area;

    }
    public static double area(double length, double breadth){
        double Area = length*breadth;
        return Area;

    }
    public static int area(int side){
        int Area = side*side;
        return Area;

    }
    public static void main(String[] args){
        double result1 = area(6.0);
        double result2 = area(2.0, 6.2);
        double result3 = area(2); // it will return double even if we are passing int argument. Automatic type promotion int- > double
        int result4 = area(2);

        System.out.println("Area of Circle       : "+result1);
        System.out.println("Area of Rectangle    : "+result2);
        System.out.println("Area of Square       : "+result3);
        System.out.println("Area of Square       : "+result4);

    }
}