package modelo;

public class Transaccion {

    int idTransaccion;
    String fecha;
    float monto;
    int tipoOperacion; //1. Alquiler ; 2. Venta
    int tipoInmueble; //1. Oficina; 2. Local; 3. Casa
    Vendedor vendedor;

    public Transaccion(int id, String fecha, float monto, int tipoOperacion, int tipoInmueble, Vendedor vendedor) {
        this.fecha = fecha;
        this.monto = monto;
        this.tipoOperacion = tipoOperacion;
        this.tipoInmueble = tipoInmueble;
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Transacción [id: " + idTransaccion;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(int tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public int getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(int tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

}
