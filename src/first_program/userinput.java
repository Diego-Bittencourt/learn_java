package first_program;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        //creating a new Scanner object and passing the System.in input stream connected to the console
        //there is a System.out which does the opposite
        Scanner input = new Scanner(System.in);

        //output the prompt
        System.out.println("Enter your favorite pokemon:");

        //Wait for the user to enter a line
        String line = input.nextLine();
        //instead of a String, you can expect an Int or other data types


        //evaluate the user input and output the result
        if (line == "Bulbasaur") {
            System.out.println("Good choice");
        } else {
            System.out.println("Wrong choice.");
        }
    }
}
