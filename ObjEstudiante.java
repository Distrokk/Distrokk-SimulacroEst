public class ObjEstudiante{
    private String Nombre;
    private String Calificacion;
    public ObjEstudiante(String nombre, String calificacion) {
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
    public String getCalificacion() {
        return Calificacion;
    }
    public void setCalificacion(String calificacion) {
        Calificacion = calificacion;
    }

    public void mostar(){
        System.out.println(Nombre + " - " + Calificacion);
    }
    
}
