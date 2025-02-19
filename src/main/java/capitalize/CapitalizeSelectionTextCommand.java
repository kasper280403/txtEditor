package capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{

    public CapitalizeSelectionTextCommand(String target) {
        super(target);
    }

    @Override
    public String execute(String text){
        String[] targetWords = target.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String targetWord : targetWords){
            sb.append(super.execute(targetWord)).append(" ");
        }
        String capitalized = sb.toString().trim();
        return text.replace(target, capitalized);
    }
}
