package Entidades;

import java.util.ArrayList;

public class Comercio {

    private final ArrayList<Presentacion> presentaciones;

    public Comercio() {
        presentaciones = new ArrayList<>();
    }

    public void agregarPresentacion(Presentacion p)
    {
        presentaciones.add(p);
    }
    
    public void listadoPresentaciones()
    {
        presentaciones.toArray();
    }
    
    public int consultasOSugerencias(){
        
        return 0;
    }
}
