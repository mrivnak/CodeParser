package lexican;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Lexican {
    String data;

    public Lexican(String _input) {
        this.data = _input;
    }

    public static void main(String args[]) {
        Lexican lex = new Lexican("(sum + 47) / total;");
        List<String> result = lex.getTokens();

        System.out.println(result.toString());
    }

    public List<String> getTokens() {
        List<String> output = new ArrayList<>();
        List<Character> buffer = new ArrayList<>();

        Boolean bufferEnable = false;

        for (int i = 0; i < data.length(); i++) {
            Character ch = data.charAt(i);

            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                buffer.add(ch);
                bufferEnable = true;
            }
            else {
                if (bufferEnable) {
                    output.add(buffer.toString().replaceAll("[,\\s\\[\\]]", ""));
                    buffer.clear();
                    bufferEnable = false;
                }

                if (!Character.isWhitespace(ch)) {
                    output.add(ch.toString());
                }
            }
        }

        return output;
    }
}
