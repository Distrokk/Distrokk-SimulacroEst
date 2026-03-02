import java.util.Scanner;

public class Metodos {
    public objsup[][] LlenarMatris(objsup[][]m){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
            objsup o= new objsup();
            System.out.println("nombre del producto");
            o.setNombre(sc.next());
            System.out.println("valor:");
            o.setPrecio(sc.nextDouble());
            System.out.println("esta en oferta:");
            o.setSw(0);
            o.setDisp(sc.nextBoolean());
            m [i][j]=o;

        }    
        }
        
        return m;
    }
    public static void mercado(objsup[][]m){
        objsup[][] s=new objsup[2][2];
  
        for (int i = 0; i < s.length; i++) {
        for (int j = 0; j < s.length; j++) {
           
            
             encontrado:
            for (int j2 = 0; j2 < m.length; j2++) {
                for (int k = 0; k < m.length; k++) {
                    
                   if(m[j2][k].getSw() == 0)
                   {
                    if(m[j2][k] != null && m[j2][k].isDisp()){
                        s[i][j]=m[j2][k];
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
   
public static void imprimir(objsup[][]s) {
for (int i = 0; i < s.length; i++) {
        for (int j = 0; j < s.length; j++) {
             if(s[i][j] !=null){
            System.out.println("\nnombre:"+s[i][j].getNombre() +"\nprecio:"+s[i][j].getPrecio());
        }
    }
}    
}
}