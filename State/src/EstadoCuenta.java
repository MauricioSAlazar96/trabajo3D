public interface EstadoCuenta {

    void hacerdeposito(double monto);
    void hacerRetiro(double monto);
    void cambiarEstado(String estado);

    void hacerDeposito(double monto);
}
