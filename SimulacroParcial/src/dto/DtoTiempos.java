/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Samuel Risso
 */
public class DtoTiempos {

    String nombre;
    String tiempo;
    String club;

    public DtoTiempos(String nombre, String tiempo, String club) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.club = club;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String toString() {
        return "Nombre: " + nombre + " | Tiempo: " + tiempo + " | Club: " + club;
    }
}
