package entidades;

public abstract class Tarjeta {
    int numero;
    float saldo;
    String titular;

    public Tarjeta(int numero, float saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public abstract boolean depositar(float importe);
    public abstract boolean extraer(float importe);
}
