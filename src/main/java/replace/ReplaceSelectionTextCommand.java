package replace;

public class ReplaceSelectionTextCommand extends ReplaceTextCommand {

    public ReplaceSelectionTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        return text.replaceFirst(target, replacement);
    }
}
