import java.util.Scanner;
import java.util.spi.CurrencyNameProvider;

public class menu {
    public static void main(String[] args) {
        ;
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        int opt = 0;
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
                    System.out.println("punto 4");
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
