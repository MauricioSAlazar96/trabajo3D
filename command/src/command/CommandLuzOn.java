package command;
import accesorios.Luz;
public class CommandLuzOn implements command {
    Luz luz;

    public CommandLuzOn(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.encender();
    }


}
