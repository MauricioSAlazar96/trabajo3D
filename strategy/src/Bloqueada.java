public class Bloqueada implements EstadoCuenta{

    private CuentaBancaria cuenta;
    private String mensj = "La cuenta bancaria fue bloqueada";

    public Bloqueada(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }
    @Override
    public void hacerdeposito(double monto){
        System.out.println(mensj);
    }
    @Override
    public void hacerDeposito(double monto) {
        System.out.println(mensj);
    }

    @Override
    public void hacerRetiro(double monto){
        System.out.println(mensj);
    }
    @Override
    public void cambiarEstado(String estado){
        if (estado.equals("cerrar")){
            cuenta.setEstado(new Cerrada(cuenta));
            System.out.printf("La cuenta fue cerrada");
        } else {
            cuenta.setEstado(new Bloqueada(cuenta));
            System.out.printf("La cuenta fue bloqueada");
        }
    }
}
