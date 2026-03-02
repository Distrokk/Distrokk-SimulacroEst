public class objsup {
    private String nombre;
    private double precio;
    private boolean disp;
    private int sw;
    private int oferta;
    public objsup(String nombre, double precio, boolean disp, int sw, int oferta) {
        this.nombre = nombre;
        this.precio = precio;
        this.disp = disp;
        this.sw = sw;
        this.oferta=oferta;
    }
    public objsup() {
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isDisp() {
        return disp;
    }
    public void setDisp(boolean disp) {
        this.disp = disp;
    }
    public int getSw() {
        return sw;
    }
    public void setSw(int sw) {
        this.sw = sw;
    }
    public int getOferta() {
        return oferta;
    }
    public void setOferta(int oferta) {
        this.oferta = oferta;
    }
    
    
}
