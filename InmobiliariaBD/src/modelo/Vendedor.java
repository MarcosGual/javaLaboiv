package modelo;

public class Vendedor {

    int idVendedor;
    String nombreCompleto;

    public Vendedor(int id, String nombreCompleto) {
        this.idVendedor = id;
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
