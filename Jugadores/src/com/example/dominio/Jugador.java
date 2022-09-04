package com.example.dominio;


/* 
De cada jugador se conoce su nombre, posición (1: arquero, 2: defensor, 
3: mediocampo, 4: delantero) número de camiseta, cantidad de partidos jugados 
y porcentaje de estado físico (100 equivale a un jugador sano y 0 a uno 
imposibilitado de jugar por lesiones).

*/
public class Jugador {
    private String nombre;
    private int posicion;
    private int numero;
    private int partidos;
    private float estado;

    public Jugador(String nombre, int posicion, int numero, int partidos, float estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
        this.partidos = partidos;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getEstado() {
        return estado;
    }

    public void setEstado(float estado) {
        this.estado = estado;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", numero=" + numero + ", partidos=" + partidos + ", estado=" + estado + '}';
    }
    
    
    
    
}
