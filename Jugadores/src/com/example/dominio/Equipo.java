/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;


import java.util.ArrayList;
/**
 *
 * @author MARTIN
 */
public class Equipo {

    private String nombre;
    private ArrayList<Jugador> plantel;

    //construtores:
    public Equipo() {
        nombre = "Sin definir";
        plantel = new ArrayList<Jugador>();
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<Jugador>();
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object[] listado() {
        return plantel.toArray();
    }
    
    //control:
    public void agregarJugador(Jugador jugador) {
        plantel.add(jugador);
        //boolean aux = false;
        //for (int i = 0; i < plantel.length; i++) {
        //    if (plantel[i] == null) {
        //        plantel[i] = jugador;
        //        aux = true;
        //        break;
        //    }
        //}

        //return aux;
    }

    public String obtenerPlantel() {
        String aux = "Equipo: " + nombre + "\n";

        for (Jugador j : plantel) {
            aux += j.getNombre() + "\n";
        }

        return aux;
    }

    public int contarJugadorConMenosDe(int cant) {
        // Item 1: contar los jugadores con menos de <cant> partidos        
        int c = 0;
        for (Jugador j : plantel) {
            if (j.getPartidos() < cant) {
                c++;
            }
        }
        return c;
    }

    public Jugador obtenerJugadorConMayorNroPartidos() {
        Jugador mayor = null;
        for (Jugador j: plantel) {
            if ( mayor == null || j.getPartidos() > mayor.getPartidos()) {
                mayor = j;
            }
        }
        return mayor;
    }

    public String partidosPorPosicion() {
        StringBuilder aux = new StringBuilder("");
        int acu[] ={0, 0, 0, 0};
        int [] contJug = {0, 0, 0, 0};
        
        int indice;
        for (Jugador j: plantel) {
           indice = j.getPosicion()-1;
           acu[indice] += j.getPartidos(); // acumulando por acceso directo
           contJug[indice] ++; //contando por acceso directo.
        }
        
        String posiciones[]={"Arqueros", "Defensores", "Mediocampistas", "Delanteros"};
        float prom;
        for (int i = 0; i < acu.length; i++) {
            if(contJug[i] != 0)
                prom = acu[i] / ((float)contJug[i]);
            else
                prom = 0;
            aux.append("Promedio partidos jugados por ").append(posiciones[i]).append(" :").append(prom).append("\n");
        }

        return aux.toString();
    }
}
