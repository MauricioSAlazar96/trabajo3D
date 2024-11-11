package Cliente;
import dispositivo.*;

public class Principal {
     public static void main(String[] args) {
         ControlInteligente control = new ControlInteligente();

         configuracion.configurar(control);

         control.clickBoton1();
         control.clickBoton3();
         control.clickBoton2();
         control.clickBoton4();

    }
}
