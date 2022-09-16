/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Habitacion {

    private int nroHabitacion;
    private String nombreHabitacion;

    public Habitacion(int nroHabitacion, String nombreHabitacion) {
        this.nroHabitacion = nroHabitacion;
        this.nombreHabitacion = nombreHabitacion;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    @Override
    public String toString() {
        return "N°:" + String.valueOf(this.nroHabitacion) + "| Denominación: " + nombreHabitacion;
    }

}
