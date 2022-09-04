package entidades;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Tarjeta> tarjetas;

    public Banco() {
        tarjetas = new ArrayList<Tarjeta>();
    }

    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }

    public boolean extraer(int numero, int tipo, float importe) {
        boolean operacionExitosa = true;
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta instanceof TarjetaDebito && tarjeta.getNumero() == numero) {
                operacionExitosa = tarjeta.extraer(importe);
                break;
            } else {
                if (tarjeta instanceof TarjetaCredito && tarjeta.getNumero() == numero) {
                    operacionExitosa = tarjeta.extraer(importe);
                    break;
                }
            }
        }
        return operacionExitosa;
    }

    public boolean depositar(int numero, int tipo, float importe) {
        boolean operacionExitosa = false;
        for (Tarjeta tarjeta : tarjetas) {
            if(tipo==0)
            {
                if(tarjeta instanceof TarjetaDebito&&tarjeta.getNumero()==numero){
                    operacionExitosa=tarjeta.depositar(importe);
                    break;
                }
            }
            else{
                if(tarjeta instanceof TarjetaCredito&&tarjeta.getNumero()==numero){
                    operacionExitosa=tarjeta.depositar(importe);
                    break;
                }
            }
        }
        return operacionExitosa;
    }
    public float saldoTotalDebito(){
        float saldoTotal=0f;
        for (Tarjeta tarjeta : tarjetas) {
            if(tarjeta instanceof TarjetaDebito)
                saldoTotal+=tarjeta.getSaldo();
        }
        return saldoTotal;
    }
    public float promedioCredito(){
        float saldoTotal=0f;
        float cantidadTarjetasCredito=0;
        
        for (Tarjeta tarjeta : tarjetas) {
            if(tarjeta instanceof TarjetaCredito){
                saldoTotal+=tarjeta.getSaldo();
                cantidadTarjetasCredito++;
            }
        }
        return saldoTotal/cantidadTarjetasCredito;
    }
}