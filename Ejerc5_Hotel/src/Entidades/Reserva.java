package Entidades;

public abstract class Reserva {
    private int numHabitacion;
    private int diasReservados;
    private boolean vigente;

    public Reserva(int numHabitacion, int diasReservados, boolean vigente) {
        this.numHabitacion = numHabitacion;
        this.diasReservados = diasReservados;
        this.vigente = vigente;
    }
    
    

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public boolean isVigente() {
        return vigente;
    }
    public abstract double calcularTarifa();
}
