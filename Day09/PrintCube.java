public class PrintCube{
    public static void printCube(int num){
        int cube = num*num*num;
        System.out.println("Cube of " +num+" is : "+cube);
        
    }

    public static void main(String[] args){
        printCube(5);
        printCube(10);
        printCube(7);
        printCube(12);
        
    }
}