
package com.example.domain;

import java.util.ArrayList;


public class GestorProducto {
    private  ArrayList<Producto> productos;

    public GestorProducto() {
        productos = new ArrayList<>();
    }
// Metodo cargar producto;
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
   // Metodo para cargar productos en un vector;
    public Object[] cargarProductos(){
    return productos.toArray();
}
    
}
