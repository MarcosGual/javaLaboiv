package Entidades;

public class Presentacion {

    int nroCliente;
    int tipoPresentacion;
    int sucursal;
    String textoPresentacion;

    public Presentacion(int nroCliente, int tipoPresentacion, int sucursal, String textoPresentacion) 
    {
        this.nroCliente=nroCliente;
        this.tipoPresentacion=tipoPresentacion;
        this.sucursal=sucursal;
        this.textoPresentacion=textoPresentacion;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public int getTipoPresentacion() {
        return tipoPresentacion;
    }

    public void setTipoPresentacion(int tipoPresentacion) {
        this.tipoPresentacion = tipoPresentacion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public String getTextoPresentacion() {
        return textoPresentacion;
    }

    public void setTextoPresentacion(String textoPresentacion) {
        this.textoPresentacion = textoPresentacion;
    }
}
