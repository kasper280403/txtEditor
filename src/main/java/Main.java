import capitalize.CapitalizeSelectionTextCommand;
import capitalize.CapitalizeWordsTextCommand;
import commands.TextCommand;

public class Main {
    public static void main(String[] args) {
        TextCommand command = new CapitalizeWordsTextCommand();
        String result = command.execute("hello, world test! this is a test.");
        System.out.println(result);
    }
}
