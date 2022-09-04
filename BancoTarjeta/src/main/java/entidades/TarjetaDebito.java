package entidades;

public class TarjetaDebito extends Tarjeta {

    public TarjetaDebito(int numero, float saldo, String titular) {
        super(numero, saldo, titular);
    }

    @Override
    public boolean depositar(float importe) {
        float nuevoSaldo = getSaldo() + importe;
        setSaldo(nuevoSaldo);
        return true;
    }

    @Override
    public boolean extraer(float importe) {
        boolean operacionExitosa = false;
        if (getSaldo() >= importe) {
            float nuevoSaldo = getSaldo() - importe;
            setSaldo(nuevoSaldo);
            operacionExitosa = true;
        }
        return operacionExitosa;
    }
}
