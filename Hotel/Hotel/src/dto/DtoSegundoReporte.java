/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Samuel Risso
 */
public class DtoSegundoReporte {

    String id;
    String denominacion;
    String sumaDeServicios;

    public DtoSegundoReporte(String id, String denominacion, String sumaDeServicios) {
        this.id = id;
        this.denominacion = denominacion;
        this.sumaDeServicios = sumaDeServicios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getSumaDeServicios() {
        return sumaDeServicios;
    }

    public void setSumaDeServicios(String sumaDeServicios) {
        this.sumaDeServicios = sumaDeServicios;
    }

    @Override
    public String toString() {

        return "ID: " + id + " | Denominacion: " + denominacion + " | Suma de servicios: " + sumaDeServicios;
    }
}
