package model;

public class Corredor {

    int id;
    String nombre;

    public Corredor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Corredor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
