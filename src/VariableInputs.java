import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String str = input.nextLine();

        System.out.println("Enter an integer:");
        int itr = Integer.valueOf(input.nextLine());

        System.out.println("Enter a double:");
        double dou = Double.valueOf(input.nextLine());

        System.out.println("Enter a boolean value:");
        boolean bol = Boolean.valueOf(input.nextLine());

        System.out.println("Your string is " + str);
        System.out.println("Your integer is " + itr);
        System.out.println("Your double is " + dou);
        System.out.println("Your boolean is " + bol);
    }
}
