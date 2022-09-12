/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Samuel Risso
 */
public class DtoTercerReporte {

    String concepto;
    String importe;

    public DtoTercerReporte(String concepto, String importe) {
        this.concepto = concepto;
        this.importe = importe;
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

    @Override

    public String toString() {
        return "Concepto: " + concepto + " Importe: $" + importe;

    }
}
