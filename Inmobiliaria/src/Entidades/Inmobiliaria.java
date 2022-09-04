package Entidades;

import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Propiedad> propiedades;
    
    public Inmobiliaria()
    {
        propiedades = new ArrayList<>();
    }
    
    public void agregarPropiedad(Propiedad propiedad)
    {
        propiedades.add(propiedad);
    }
    
    /*
    Calcular y mostrar el monto promedio de alquileres de las propiedades en
donde vivan 2 inquilinos.
▪ Calcular y mostrar la cantidad de casas de 3 habitaciones o más que posean garaje
    */
    
    public double promedioAlquileresDosInquilinos()
    {
        double promedio = 0;
        double totalAlquileres = 0;
        int contador = 0;
        for (Propiedad propiedad : propiedades) {
            if(propiedad.getCantidadInquilinos() == 2)
            {
                totalAlquileres += propiedad.calcularAlquiler();
                contador++;
            }
        }
        
        if(contador != 0)
            promedio = totalAlquileres / contador;
                    
        return promedio;
    }
    
    public int cantidadCasasConCondiciones()
    {
        int cantidadCasas = 0;
        for (Propiedad propiedad : propiedades) {
            if(propiedad instanceof Casa)
            {
                Casa casa = (Casa)propiedad;
                if(casa.isTieneGarage() && casa.getCantidadHabitaciones() >= 3)
                    cantidadCasas++;
            }
        }
        
        return cantidadCasas;
    }
    
}
