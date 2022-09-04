package Entidades;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reserva> reservas;
    public Hotel(){
        reservas = new ArrayList<>();
        
    }
    public void agregarReserva(Reserva nueva){
        reservas.add(nueva);
    }
    public double facturacionTotalPrevista(){
        double facturacion = 0;
        for (Reserva r : reservas) {
            facturacion += r.calcularTarifa();
        }
        return facturacion;
    }
    public int[] cantidadReservasPorTipo(){
        //index 0 cuenta vacaciones, index 1 cuenta negocios
        int[] cantReservas = {0,0};
        for (Reserva r : reservas) {
            if(r instanceof Vacaciones)
                cantReservas[0]++;
            else
                cantReservas[1]++;
        }
        return cantReservas;
    }
}
