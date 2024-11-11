package command;
import accesorios.Tv;
public class CommandTvOn implements command {
    Tv tv;
    public CommandTvOn(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
    }

}
