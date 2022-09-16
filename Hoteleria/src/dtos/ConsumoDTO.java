/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dtos;

public class ConsumoDTO {
    private int idHabitacion;
    private String nombre;
    private float total;
    private int cantidad;

    public ConsumoDTO(int idHabitacion, String nombre, float total, int cantidad) {
        this.idHabitacion = idHabitacion;
        this.nombre = nombre;
        this.total = total;
        this.cantidad = cantidad;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getDenominacion() {
        return nombre;
    }

    public void setDenominacion(String nombre) {
        this.nombre = nombre;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Habitación: "+nombre+" | Total consumos: "+String.valueOf(total)+" | Cantidad: "+String.valueOf(cantidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
