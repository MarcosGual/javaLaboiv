package gestor;

import com.example.dominio.Casa;
import com.example.dominio.Propiedad;
import java.util.ArrayList;

public class Inmobiliaria {

    private final ArrayList<Propiedad> propiedades;

    public Inmobiliaria() {
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad p) {
        propiedades.add(p);
    }

    public float promAlqDosInqui() {
        int cantProp = 0;
        float montoTotal = 0;
        for (Propiedad p : propiedades) {
            if (p.getCantInquilinos() == 2) {
                cantProp++;
                montoTotal += p.calcularAlquiler();
            }
        }
        if (cantProp != 0) {
            return montoTotal / cantProp;
        } else {
            return 0;
        }
    }

    public int cantCasas3habGarage() {
        int cantCasas = 0;

        for (Propiedad p : propiedades) {
            if (p instanceof Casa) {
                Casa c = (Casa) p;
                if (c.getCantHabi() >= 3 && c.isGarage()) {
                    cantCasas++;
                }
            }
        }
        return cantCasas;
    }

    public Object[] listado() {
        return propiedades.toArray();
    }
}
