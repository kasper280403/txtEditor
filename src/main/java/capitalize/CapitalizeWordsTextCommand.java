package capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

    public CapitalizeWordsTextCommand(){
        super("capitalize");
    }


    @Override
    public String execute(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
            sb.append(capitalized).append(" ");
        }
        return sb.toString().trim();
    }
}
