package com.example;

import com.example.dominio.Equipo;
import com.example.dominio.Jugador;
import com.example.interfaz.VentanaPrincipal;
import java.util.Scanner;

/**
 *
 * Desarrollar un programa que permita cargar todos los datos de los jugadores y
 * a continuación informe: • Cantidad de jugadores con menos de 10 partidos
 * jugados. • Nombre del jugador con mayor cantidad de partidos jugados. •
 * Promedio de estado físico de todo el equipo. • Estado físico de un jugador
 * particular identificado por número de camiseta. • Promedio de partidos
 * jugados de los jugadores de cada posición (4 resultados).
 *
 */
public class Jugadores {
    
    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cantidad;
//
//        System.out.println("Ingrese la cantidad de jugadores: ");
//        cantidad = sc.nextInt();
//
//        Equipo equipo = new Equipo("Crazy Team");
//
//        for (int i = 0; i < cantidad; i++) {
//            System.out.print("Ingrese el nombre: ");
//            String nombre = sc.next();
//
//            System.out.print("Ingrese la posición: ");
//            int posicion = sc.nextInt();
//
//            System.out.print("Ingrese el numero de la camiseta: ");
//            int numero = sc.nextInt();
//
//            System.out.print("Ingrese la cantidad de partidos jugados: ");
//            int partidos = sc.nextInt();
//
//            System.out.print("Ingrese el porcentaje de estado físico: ");
//            float estado = sc.nextInt();
//
//            Jugador j = new Jugador(nombre, posicion, numero, partidos, estado);
//            equipo.agregarJugador(j);
//        }
//        // Listado del contenido del arreglo
//        // Solo para verificar si se cargó bien
//        System.out.println(equipo.obtenerPlantel());
//
//        int cantPartidos = equipo.contarJugadorConMenosDe(10);
//
//        // Item 2: nombre del jugador con mayor cantidad de partidos jugados
//        Jugador mayor = equipo.obtenerJugadorConMayorNroPartidos();
//        System.out.println("El jugador que jugó más partidos es: " + mayor.getNombre());
//
//        // Item 5: promedio de partidos jugados por posición. versión: Jeffrey
//        System.out.println(equipo.partidosPorPosicion());
//    }
}
