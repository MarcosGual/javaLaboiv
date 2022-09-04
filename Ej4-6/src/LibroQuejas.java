
import java.util.ArrayList;

public class LibroQuejas {

    private ArrayList<Presentacion> listaPresentaciones;

    public LibroQuejas() {
        listaPresentaciones = new ArrayList<>();
    }
    
    public void agregarPresentacion(Presentacion nueva) {
        listaPresentaciones.add(nueva);
    }
            
    public Object[] listar() {
        return listaPresentaciones.toArray();
    }
    
    public int contarConsultasSugerencias() {
        int c = 0;
        for (Presentacion p : listaPresentaciones) {
            if (p.getTipo() == 2 || p.getTipo() == 3)
                c++;
        }
        
        return c;
    }
    
    
    public int contarSucursal0() {
        int c = 0;
        for (Presentacion p : listaPresentaciones) {
            if (p.getSucursal() == 0)
                c++;
        }
        
        return c;
    }
    
}
