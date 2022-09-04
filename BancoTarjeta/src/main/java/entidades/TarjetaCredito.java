package entidades;

public class TarjetaCredito extends Tarjeta {

    private float limite;

    public TarjetaCredito(float limite, int numero, float saldo, String titular) {
        super(numero, saldo, titular);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean extraer(float importe) {
        boolean operacionExitosa = false;
        if(importe+getSaldo()<=limite){
            float nuevoImporte=getSaldo()+limite;
            setSaldo(nuevoImporte);
            operacionExitosa=true;
        }
        return operacionExitosa;
    }
    
    @Override
    public boolean depositar(float importe){
        float saldoNuevo=getSaldo()-importe;
        setSaldo(saldoNuevo);
        return true;
    }
}
