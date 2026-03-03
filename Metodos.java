import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public objsup[][] LlenarMatris(objsup[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objsup o = new objsup();
                System.out.println("nombre del producto");
                o.setNombre(sc.next());
                System.out.println("valor:");
                o.setPrecio(sc.nextDouble());
                System.out.println("esta en oferta:");
                o.setSw(0);
                o.setDisp(sc.nextBoolean());
                m[i][j] = o;

            }
        }

        return m;
    }

    public static void mercado(objsup[][] m) {
        objsup[][] s = new objsup[2][2];

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {

                encontrado: for (int j2 = 0; j2 < m.length; j2++) {
                    for (int k = 0; k < m.length; k++) {

                        if (m[j2][k].getSw() == 0) {
                            if (m[j2][k] != null && m[j2][k].isDisp()) {
                                s[i][j] = m[j2][k];
                                m[j2][k].setSw(1);
                                break encontrado;
                            }
                        }
                    }
                }
            }
        }

        imprimir(s);
    }

    public static void imprimir(objsup[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[i][j] != null) {
                    System.out.println("\nnombre:" + s[i][j].getNombre() + "\nprecio:" + s[i][j].getPrecio());
                }
            }
        }
    }

    public ObjEstudiante[][] LlenarMatriz(int n) {

        ObjEstudiante[][] matriz = new ObjEstudiante[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("\n Estudiante [" + i + "][" + j + "]");

                System.out.println("Nombre del estudiante: ");
                String Nombre = sc.nextLine();

                System.out.println("Calificacion del estudiante: ");
                double Calificacion = sc.nextDouble();
                sc.nextLine();
                if(Calificacion < 1 || Calificacion > 5){
                    System.out.println("Valores invalidos, vuelva a ingresar el valor mayor a 1, menor que 5");
                }
                while(Calificacion < 1 || Calificacion > 5);

                matriz[i][j] = new ObjEstudiante(Nombre, Calificacion);
            }
        }

        return matriz;
    }

    public void AgruparEstudiantes(ObjEstudiante[][] matriz) {
        ArrayList<ObjEstudiante> exelente = new ArrayList<>();
        ArrayList<ObjEstudiante> bueno = new ArrayList<>();
        ArrayList<ObjEstudiante> bajo = new ArrayList<>();
        ArrayList<ObjEstudiante> lamentable = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                ObjEstudiante est = matriz[i][j];
                double nota = est.getCalificacion();

                if (nota >= 5.4) {
                    exelente.add(est);
                } else if (nota >= 3.5) {
                    bueno.add(est);
                } else if(nota >= 3.0){
                    bajo.add(est);
                } else{
                    lamentable.add(est);
                }
            }
        }

        System.out.println("\nEXELENTE: ");
        for (ObjEstudiante e : exelente)
            e.mostar();

        System.out.println("\nBUENO: ");
        for (ObjEstudiante e : bueno)
            e.mostar();

        System.out.println("\nBAJO: ");
        for (ObjEstudiante e : bajo)
            e.mostar();

        System.out.println("\nLAMENTABLE: ");
        for (ObjEstudiante e : lamentable)
            e.mostar();
    }
}