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
public class Casa extends Propiedad{
    private boolean garage;

    public Casa(boolean garage, String direccion, int cantHabi, float precioBaseAlq, boolean usoComercial, int cantInquilinos) {
        super(direccion, cantHabi, precioBaseAlq, usoComercial, cantInquilinos);
        this.garage = garage;
    }

    public Casa(boolean garage) {
        this.garage = garage;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }
    @Override
    public String toString(){
        return super.toString() + "Garage: " +( garage ? "si" : "no");
    }
    @Override
    public float calcularAlquiler(){
        float alqTotal = super.getPrecioBaseAlq();
        if(super.isUsoComercial())
            alqTotal += 1000;
        return alqTotal;
    }
}
