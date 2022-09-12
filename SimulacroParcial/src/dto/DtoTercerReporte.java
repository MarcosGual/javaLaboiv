/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Samuel Risso Nombre del corredor, tiempoInsumido insumido y nombre del club
 */
public class DtoTercerReporte {

    String nombre;
    Double tiempoInsumido;
    String club;

    public DtoTercerReporte(String nombre, Double tiempo, String club) {
        this.nombre = nombre;
        this.tiempoInsumido = tiempo;
        this.club = club;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTiempo() {
        return tiempoInsumido;
    }

    public void setTiempo(Double tiempo) {
        this.tiempoInsumido = tiempo;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String toString() {

        return "Nombre: " + nombre + " | Tiempo: " + tiempoInsumido + " | Club: " + club;
    }
}
