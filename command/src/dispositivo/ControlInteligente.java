package dispositivo;

public class ControlInteligente {

    private command.command boton1;
    private command.command boton2;
    private command.command boton3;
    private command.command boton4;

    public void clickBoton1() {
        boton1.execute();
    }

    public void clickBoton2() {
        boton2.execute();
    }

    public void clickBoton3() {
        boton3.execute();
    }

    public void clickBoton4() {
        boton4.execute();
    }

    public command.command getBoton1() {
        return boton1;
    }

    public void setBoton1(command.command boton1) {
        this.boton1 = boton1;
    }

    public command.command getBoton2() {
        return boton2;
    }

    public void setBoton2(command.command boton2) {
        this.boton2 = boton2;
    }

    public command.command getBoton3() {
        return boton3;
    }

    public void setBoton3(command.command boton3) {
        this.boton3 = boton3;
    }

    public command.command getBoton4() {
        return boton4;
    }

    public void setBoton4(command.command boton4) {
        this.boton4 = boton4;
    }
}
