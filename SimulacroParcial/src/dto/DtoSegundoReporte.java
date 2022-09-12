package dto;

public class DtoSegundoReporte {

    String nombre;
    Double promedio;

    public DtoSegundoReporte(String nombre, Double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Promedio: " + this.promedio;
    }
}
