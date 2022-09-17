/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Curso {

    private int idCurso;
    private String nombre;
    private float precioCuota;
    private int cantidadCuotas;
    private int activo;

    public Curso(int idCurso, String nombre, float precioCuota, int cantidadCuotas, int activo) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.precioCuota = precioCuota;
        this.cantidadCuotas = cantidadCuotas;
        this.activo = activo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioCuota() {
        return precioCuota;
    }

    public void setPrecioCuota(float precioCuota) {
        this.precioCuota = precioCuota;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Curso n°: " + String.valueOf(idCurso) + " | Nombre: " + nombre;
    }

}
