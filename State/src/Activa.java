import javax.sound.midi.Soundbank;

public class Activa implements EstadoCuenta {
    private CuentaBancaria cuenta;

    public Activa(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }

    @Override
    public void hacerdeposito(double monto) {
        cuenta.setSaldo(cuenta.getGetSaldo(monto)+monto);

    }
    @Override
    public void hacerDeposito(double monto) {

    }

    @Override
    public void hacerRetiro(double monto) {
        cuenta.setSaldo(cuenta.getSaldo()-monto);

    }

    @Override
    public void cambiarEstado(String estado) {
        if (estado.equals("cerrar")){
            cuenta.setEstado(new Cerrada(cuenta));
            System.out.println("La cuenta fue Cerrada...");
        }
        else {
            cuenta.setEstado(new  Bloqueada(cuenta));
            System.out.println("La cuenta fue Bloqueada");
        }

    }


}
