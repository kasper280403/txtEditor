package replace;
import commands.TextCommand;

public class ReplaceTextCommand implements TextCommand {

    public String target;
    public String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    @Override
    public String execute(String text) {
        return text.replace(target, replacement);
    }

}
