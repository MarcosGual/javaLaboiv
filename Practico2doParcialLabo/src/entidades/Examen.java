package entidades;


public class Examen {
    private String nombreMateria;
    private int tipoEvaluacion; //parcial:0, recuperatorio:1, final:2
    private float nota;
    private int modalEntrega;

    public Examen(String nombreMateria, int tipoEvaluacion, float nota, int modalEntrega) {
        this.nombreMateria = nombreMateria;
        this.tipoEvaluacion = tipoEvaluacion;
        this.nota = nota;
        this.modalEntrega = modalEntrega;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(int tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getModalEntrega() {
        return modalEntrega;
    }

    public void setModalEntrega(int modalEntrega) {
        this.modalEntrega = modalEntrega;
    }
    
    
}
