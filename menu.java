import java.util.Scanner;
import java.util.spi.CurrencyNameProvider;

public class menu {
    public static void main(String[] args) {
        ;
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        int opt = 0;
        int n = 0;
        System.out.println("Ingrese la dimension de la matrix");
        n = sc.nextInt();
        while (continuar) {
            System.out.println("Simulcaro de p de matrices objetuales");
            System.out.println("ingrese el punto que desea ejecutar");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("punto 1");
                    break;
                case 2:
                    System.out.println("punto 2");
                    break;
                case 3:
                    System.out.println("punto 3");
                    break;
                case 4:
                    Punto4Asiento[][] teatro = new Punto4Asiento[n][n];
                    for (int i = 1; i < n; i++) {
                        for (int j = 1; j < n; j++) {

                            System.out.println("Asiento fila " + i + " posición " + j);

                            System.out.print("Número de asiento: ");
                            int numero = sc.nextInt();

                            System.out.print("Precio: ");
                            double precio = sc.nextDouble();

                            teatro[i][j] = new Punto4Asiento(numero, i, precio);
                        }
                    }

                    for (int i = 1; i < n; i++) {

                        for (int j = 1; j < n - 1; j++) {
                            for (int k = 1; k < n - 1 - j; k++) {

                                if (teatro[i][k].precio > teatro[i][k + 1].precio) {

                                    Punto4Asiento temp = teatro[i][k];
                                    teatro[i][k] = teatro[i][k + 1];
                                    teatro[i][k + 1] = temp;
                                }
                            }
                        }
                    }

                    System.out.println("\nAsientos ordenados por precio en cada fila:\n");

                    for (int i = 1; i < n; i++) {
                        System.out.print("Fila " + i + ": ");
                        for (int j = 1; j < n; j++) {
                            System.out.print(teatro[i][j] + " ");
                        }
                        System.out.println();
                    }

                    sc.close();

                    break;
                case 5:
                    System.out.println("punto 5");
                    break;
                case 6:
                    System.out.println("punto 6");
                    break;
                case 7:
                    System.out.println("punto 7");
                    break;
                case 8:
                    System.out.println("punto 8");
                    break;
                case 9:
                    System.out.println("punto 9");
                    break;
                case 10:
                    System.out.println("punto 10");
                    break;
                case 11:
                    System.out.println("punto 11");
                    continuar = false;
                    break;
                default:
                    System.out.println("Esa opcion no existe por favor mire el menu");

            }

        }

    }

}
