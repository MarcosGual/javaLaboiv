package modelo;

public class Cliente {

    int id;
    String nombre;
    String apellido;
    String calle;
    int altura;
    int codigoBarrio;
    int nroTel;
    String email;

    public Cliente(String nombre, String apellido, String calle, int altura, int codigoBarrio, int nroTel, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
        this.altura = altura;
        this.codigoBarrio = codigoBarrio;
        this.nroTel = nroTel;
        this.email = email;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCodigoBarrio() {
        return codigoBarrio;
    }

    public void setCodigoBarrio(int codigoBarrio) {
        this.codigoBarrio = codigoBarrio;
    }

    public int getNroTel() {
        return nroTel;
    }

    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CLIENTE N°: " + id + "; nombre: " + nombre + "; apellido: " + apellido + "; calle: " + calle + "; altura: " + altura;
    }
}
