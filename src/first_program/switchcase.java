package first_program;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Please, enter a initial pokemon from first generation");
String text = input.nextLine();
// String something = "bulbasaur";

switch(text) {
    // In the case statement, you can only use hardcoded value, usually int or String
    //you can't compare the switch arg to a variable.
    case "bulbasaur":
    // case something:
        System.out.println("Good choice");
        break;

    case "charmander":
        System.out.println("Bad choice");
        break;

    case "squirtle":
        System.out.println("That is an ok choice");
        break;

    case "pikachu":
        System.out.println("Everyone is tired of that pokemon.");
        break;

    default:
        System.out.println("Try write all in lower case. Don't know that pokemon");
}

    }
}
