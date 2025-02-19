package wrap;

public class WrapLinesTextCommand extends WrapTextCommand {

    public WrapLinesTextCommand(String target, String start, String end) {
        super(target, start, end);
    }

    @Override
    public String execute(String text){
        String[] lines = text.split("\n");
        StringBuilder sb = new StringBuilder();
        for(String line : lines){
            sb.append(super.execute(line)).append("\n");
        }
        return sb.toString();
    }
}
