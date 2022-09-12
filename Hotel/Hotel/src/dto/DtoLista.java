/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Samuel Risso
 */
public class DtoLista {

    String concepto;
    String importe;
    String denominacion;

    public DtoLista(String concepto, String importe, String denominacion) {
        this.concepto = concepto;
        this.importe = importe;
        this.denominacion = denominacion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Concepto: " + concepto + " importe: $" + importe + " habitacion: " + denominacion;
    }
}
