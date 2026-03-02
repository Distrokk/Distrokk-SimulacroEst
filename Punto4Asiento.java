public class Punto4Asiento {
    int numero;
    int fila;
    double precio;

    public Punto4Asiento(int numero, int fila, double precio) {
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    }

    public String toString() {
        return "[Num: " + numero + ", Precio: " + precio + "]";
    }
}