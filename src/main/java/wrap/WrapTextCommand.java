package wrap;
import commands.TextCommand;

public class WrapTextCommand implements TextCommand {

    public String target;
    public String start;
    public String end;

    public WrapTextCommand(String target, String start, String end) {
        this.target = target;
        this.start = start;
        this.end = end;
    }

    @Override
    public String execute(String text){
        return  start +" "+ text +" "+ end;
    }

}
