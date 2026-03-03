
public class objtienda {

   private String Producto;
   private int Cantidad;
   
   public objtienda() {
   }

   public objtienda(String producto, int cantidad) {
    Producto = producto;
    Cantidad = cantidad;
   }

   public String getProducto() {
    return Producto;
   }

   public void setProducto(String producto) {
    Producto = producto;
   }

   public int getCantidad() {
    return Cantidad;
   }

   public void setCantidad(int cantidad) {
    Cantidad = cantidad;
   }
    
}



