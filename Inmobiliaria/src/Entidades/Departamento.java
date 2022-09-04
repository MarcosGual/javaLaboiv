package Entidades;

public class Departamento extends Propiedad {
    private double expensas;
    
    public Departamento(String direccion, int cantidadHabitaciones, double precioBase, boolean usoComercial, int cantidadInquilinos, double expensas) {
        super(direccion, cantidadHabitaciones, precioBase, usoComercial, cantidadInquilinos);
        this.expensas = expensas;
    }
    
    @Override
    public double calcularAlquiler()
    {
        double alquiler = getPrecioBase() + expensas;
        
        if(isUsoComercial())
            alquiler += 500;
        
        return alquiler;
    }
}
