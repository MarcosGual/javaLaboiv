public class Presentacion {

    private int numero;
    private int tipo;
    private int sucursal;
    private String texto;

    public Presentacion(int numero, int tipo, int sucursal, String texto) {
        this.numero = numero;
        this.tipo = tipo;
        this.sucursal = sucursal;
        this.texto = texto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Presentacion{" + "numero=" + numero + ", tipo=" + tipo + ", sucursal=" + sucursal + ", texto=" + texto + '}';
    }
    
    
}
