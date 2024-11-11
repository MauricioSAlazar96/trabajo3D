public class CuentaBancaria {
    private double saldo;
    private EstadoCuenta estado;

    public CuentaBancaria() {
        saldo = 0;
        estado = new Activa(this);
    }

    public void hacerDeposito(double monto) {
        estado.hacerdeposito(monto);
    }

    public void hacerRetiro(double monto) {
        estado.hacerRetiro(monto);
    }

    public void CambiarEstado(String nuevo) {
        estado.cambiarEstado(nuevo);
        setEstado(estado);
    }

    public double getSaldo() {
        return saldo;
    }

    public double getGetSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEstado(EstadoCuenta estado) {
        this.estado = estado;
    }

    public void getEstado(){
        System.out.printf(estado.toString());
    }
    public void saldoActual(){
        System.out.printf("Tu saldo actual es" +getSaldo());
    }




}
