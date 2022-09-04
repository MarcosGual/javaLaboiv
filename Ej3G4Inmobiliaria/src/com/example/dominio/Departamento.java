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
public class Departamento extends Propiedad {
    private float precioExpensas;

    public Departamento(float precioExpensas, String direccion, int cantHabi, float precioBaseAlq, boolean usoComercial, int cantInquilinos) {
        super(direccion, cantHabi, precioBaseAlq, usoComercial, cantInquilinos);
        this.precioExpensas = precioExpensas;
    }

    public Departamento(float precioExpensas) {
        this.precioExpensas = precioExpensas;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Precio Expensas: " + precioExpensas;
    }
    @Override
    public float calcularAlquiler(){
        float alqTotal = super.getPrecioBaseAlq()+ precioExpensas;
        if(super.isUsoComercial())
            alqTotal += 500;
        return alqTotal;
    }
}
