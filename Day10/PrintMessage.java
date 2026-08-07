public class PrintMessage{
    public static void printMessage(){
        System.out.println("Hello!");
    }
    public static void printMessage(String name){
        System.out.println("Hello! " +name);
    }
    public static void printMessage(String message, int time){
        for(int i = 1; i<=time; i++){
            System.out.println(message);
        }
    }

    public static void main(String[] args){
            printMessage();
            printMessage("Anshu");
            printMessage("Welcome", 3);

    }
}