package Entidades;

public class Casa extends Propiedad {

    private boolean tieneGarage;

    public Casa(boolean tieneGarage, String direccion, int cantidadHabitaciones, double precioBase, boolean usoComercial, int cantidadInquilinos) {
        super(direccion, cantidadHabitaciones, precioBase, usoComercial, cantidadInquilinos);
        this.tieneGarage = tieneGarage;
    }
    
    @Override
    public double calcularAlquiler() {
        
        double alquiler = getPrecioBase();
        
        if(isUsoComercial())
            alquiler += 1000;
        
        return alquiler;
    }

    public boolean isTieneGarage() {
        return tieneGarage;
    }
    
    
}
