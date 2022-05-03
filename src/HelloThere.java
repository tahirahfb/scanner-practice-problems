import java.util.Scanner; 

public class HelloThere {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello There! How are you doing today?");
        input.nextLine();

        System.out.println("Wow - Interesting! Tell me more!");
        input.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");
    }
}
