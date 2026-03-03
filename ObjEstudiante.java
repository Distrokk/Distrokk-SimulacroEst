public class ObjEstudiante{
    private String Nombre;
    private double Calificacion;
    public ObjEstudiante(String nombre, double calificacion) {
        Nombre = nombre;
        Calificacion = calificacion;
    }
    public ObjEstudiante() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getCalificacion() {
        return Calificacion;
    }
    public void setCalificacion(double calificacion) {
        Calificacion = calificacion;
    }

    public void mostar(){
        System.out.println(Nombre + " - " + Calificacion);
    }
    
}
