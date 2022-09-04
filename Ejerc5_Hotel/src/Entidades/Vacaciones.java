package Entidades;

public class Vacaciones extends Reserva{
    private int cantNinios;

    public Vacaciones(int cantNinios, int numHabitacion, int diasReservados, boolean vigente) {
        super(numHabitacion, diasReservados, vigente);
        this.cantNinios = cantNinios;
    }

    public int getCantNinios() {
        return cantNinios;
    }

    public void setCantNinios(int cantNinios) {
        this.cantNinios = cantNinios;
    }
    
    
    
    
    
    @Override
    public double calcularTarifa() {
        double tarifa = (super.getDiasReservados()*600)+(100*cantNinios);
        
        return tarifa;
    }

    @Override
    public String toString() {
        return "Vacaciones{" + "cantNinios=" + cantNinios + super.toString() +'}';
    }
    
}
