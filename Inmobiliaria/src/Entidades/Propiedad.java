
package Entidades;

public abstract class Propiedad {
    private String direccion;
    private int cantidadHabitaciones;
    private double precioBase;
    private boolean usoComercial;
    private int cantidadInquilinos;
    
    public abstract double calcularAlquiler();

    public Propiedad(String direccion, int cantidadHabitaciones, double precioBase, boolean usoComercial, int cantidadInquilinos) {
        this.direccion = direccion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.precioBase = precioBase;
        this.usoComercial = usoComercial;
        this.cantidadInquilinos = cantidadInquilinos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public int getCantidadInquilinos() {
        return cantidadInquilinos;
    }
    
}
