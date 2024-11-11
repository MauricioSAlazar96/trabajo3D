package command;
import accesorios.Tv;
public class CommandTvOff implements command {
    Tv tv;

    public CommandTvOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

}
