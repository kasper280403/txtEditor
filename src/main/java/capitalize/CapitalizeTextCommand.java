package capitalize;

import commands.TextCommand;

public class CapitalizeTextCommand implements TextCommand {
    public String target;

    public CapitalizeTextCommand(String target) {
        this.target = target;
    }

    @Override
    public String execute(String text){
        if (!text.contains(target) || target.isEmpty()) {
            return text;
        }

        String capitalized = target.substring(0, 1).toUpperCase() + target.substring(1);

        return text.replace(target, capitalized);
    }
}

