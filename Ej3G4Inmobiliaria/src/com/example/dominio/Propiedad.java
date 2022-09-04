/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author rodri
 */
public abstract class Propiedad {
    private String direccion;
    private int cantHabi;
    private float precioBaseAlq;
    private boolean usoComercial;
    private int cantInquilinos;

    public Propiedad(String direccion, int cantHabi, float precioBaseAlq, boolean usoComercial, int cantInquilinos) {
        this.direccion = direccion;
        this.cantHabi = cantHabi;
        this.precioBaseAlq = precioBaseAlq;
        this.usoComercial = usoComercial;
        this.cantInquilinos = cantInquilinos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantHabi() {
        return cantHabi;
    }

    public void setCantHabi(int cantHabi) {
        this.cantHabi = cantHabi;
    }

    public float getPrecioBaseAlq() {
        return precioBaseAlq;
    }

    public void setPrecioBaseAlq(float precioBaseAlq) {
        this.precioBaseAlq = precioBaseAlq;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public void setUsoComercial(boolean usoComercial) {
        this.usoComercial = usoComercial;
    }

    public int getCantInquilinos() {
        return cantInquilinos;
    }

    public void setCantInquilinos(int cantInquilinos) {
        this.cantInquilinos = cantInquilinos;
    }
    
    public Propiedad(){
        
    }
    
    public abstract float calcularAlquiler();

    @Override
    public String toString() {
        return "Propiedad{" + "direccion=" + direccion + ", cantHabi=" + cantHabi + ", precioBaseAlq=" + precioBaseAlq + ", usoComercial=" + usoComercial + ", cantInquilinos=" + cantInquilinos;
    }
    
}
