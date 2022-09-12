/*
IdServicio (PK) int
Concepto varchar
IdHabitacion (FK) int
Importe float

 */
package model;

/**
 *
 * @author Samuel Risso
 */
public class Servicio {

    Integer id;
    String concepto;
    Habitacion habitacion;
    Double importe;

    public Servicio(Integer id, String concepto, Habitacion habitacion, Double importe) {
        this.id = id;
        this.concepto = concepto;
        this.habitacion = habitacion;
        this.importe = importe;
    }

    public Servicio(String concepto, Habitacion habitacion, Double importe) {
        this.concepto = concepto;
        this.habitacion = habitacion;
        this.importe = importe;
    }

    public Servicio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {

        return "En concepto de " + concepto + " importe: $" + importe + " | Habitacion: " + habitacion.denominacion;
    }
}
