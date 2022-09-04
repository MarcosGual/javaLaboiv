package entidades;

import java.util.ArrayList;

public class Universidad {

    private ArrayList<Examen> examenes;

    public Universidad() {
        examenes = new ArrayList<Examen>();
    }

    public void agregarExamen(Examen e) {
        examenes.add(e);
    }

    public float promedioParciales() {
        float contParciales = 0;
        float acuParciales = 0;

        for (Examen e : examenes) {
            if (e.getTipoEvaluacion() == 0) {
                contParciales++;
                acuParciales += e.getNota();
            }
        }
        return acuParciales / contParciales;
    }

    public int recuDesaprobados() {
        int desaprobados = 0;
        for (Examen e : examenes) {
            if (e.getTipoEvaluacion() == 1) {
                if (e.getNota() < 6) {
                    desaprobados++;
                }
            }
        }
        return desaprobados;
    }

    public int materiasAprobadasZoom() {
        //boolean materia = false;
        int contZoom = 0;
        for (Examen e : examenes) {
            if (e.getModalEntrega() == 2) {
                if(e.getNota()>=6);
                contZoom++;
            }
        }

        return contZoom;
    }
    
    public Object[] listar(){
        return examenes.toArray();
    }
}
