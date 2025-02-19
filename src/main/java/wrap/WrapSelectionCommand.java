package wrap;

public class WrapSelectionCommand extends WrapTextCommand{

    public WrapSelectionCommand(String target, String start, String end) {
        super(target, start, end);
    }

    @Override
    public String execute(String text){
        if(!text.contains(target)){
            return text;
        }

        return text.replace(target, super.execute(target));
    }
}
