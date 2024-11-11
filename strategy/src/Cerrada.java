public class Cerrada implements EstadoCuenta{

    private CuentaBancaria cuenta;
    private String mensj = "La cuenta se encuentra Cerrada No se puede realizar operacion";
    public Cerrada (CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }
    @Override
    public void hacerdeposito(double monto) {
        System.out.printf(mensj);
    }

    @Override
    public void hacerDeposito(double monto) {
        System.out.printf(mensj);
    }

    @Override
    public void hacerRetiro(double monto) {
        System.out.printf(mensj);

    }

    @Override
    public void cambiarEstado(String estado) {
        cuenta.setEstado(new Activa(cuenta));
        System.out.printf("La cuenta Fue abierta nuevamente...");

    }

}
