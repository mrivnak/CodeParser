import lexican.Lexican;

import java.util.List;
import java.util.Scanner;

public class Parser {
    static List<String> tokens;

    public static void main(String args[]) {
        // Read input from console
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a statement to evaluate: ");
        String data = input.nextLine();
        input.close();
        */

        // FIXME: just for quick testing
        String data = "20 – (10+6)/4;";

        Lexican lex = new Lexican(data);
        tokens = lex.getTokens();
    }

    private String statement() {
        return "";
    }

    private String expression() {
        return "";
    }

    private String term() {
        return "";
    }

    private String factor() {
        return "";
    }
}