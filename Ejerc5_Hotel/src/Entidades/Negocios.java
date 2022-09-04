package Entidades;

public class Negocios extends Reserva{
    private boolean conferencia;

    public Negocios(boolean conferencia, int numHabitacion, int diasReservados, boolean vigente) {
        super(numHabitacion, diasReservados, vigente);
        this.conferencia = conferencia;
    }

    public boolean isConferencia() {
        return conferencia;
    }

    public void setConferencia(boolean conferencia) {
        this.conferencia = conferencia;
    }

    @Override
    public double calcularTarifa() {
        double tarifa = super.getDiasReservados()*500;
        if(conferencia){
            tarifa += 700;
        }
        return tarifa;
    }

    @Override
    public String toString() {
        return "Negocios{" + "conferencia=" + conferencia + '}';
    }
    
    
}
