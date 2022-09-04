
package com.example.domain;


public class Producto {
    private int codigo;
    private String nombre;
    private float precio;
    private boolean oferta;
    private int stock;
    private String ubicacion;

    public Producto() {
    }

    public Producto(int codigo, String nombre, float precio, boolean oferta, int stock, String ubicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.oferta = oferta;
        this.stock = stock;
        this.ubicacion = ubicacion;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", oferta=").append(oferta);
        sb.append(", stock=").append(stock);
        sb.append(", ubicacion=").append(ubicacion);
        sb.append('}');
        return sb.toString();
    }
    
}
