import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("What's your name?");

        String name = input.nextLine();
        System.out.println("Hi " + name);
    }
}
