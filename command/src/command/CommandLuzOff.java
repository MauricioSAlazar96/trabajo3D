package command;
import accesorios.Luz;
public class CommandLuzOff implements command {
    Luz luz;

    public CommandLuzOff(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar();
    }

}
