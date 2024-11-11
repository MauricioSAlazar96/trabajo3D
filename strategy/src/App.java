public class App {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.hacerDeposito(500);
        cuenta1.saldoActual();
        cuenta1.hacerRetiro(300);
        cuenta1.saldoActual();
        cuenta1.getEstado();

    }
}
