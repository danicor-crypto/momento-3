
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] lote = {
            "Jeans AirFlex",
            "Graphic Tee",
            "Denim Jacket",
            null,
            null
        };

        int opcion;

        do {

            System.out.println("\n=== AMERICAN EAGLE ===");
            System.out.println("1. Listar prendas");
            System.out.println("2. Buscar prenda");
            System.out.println("3. Ingresar prenda");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = Integer.parseInt(teclado.nextLine());

            if (opcion == 1) {

                System.out.println("Opción para listar prendas.");

            } else if (opcion == 2) {

                System.out.println("Opción para buscar prendas.");

            } else if (opcion == 3) {

                System.out.println("Opción para ingresar prendas.");

            } else if (opcion == 4) {

                System.out.println("Cerrando aplicación...");

            } else {

                System.out.println("Opción incorrecta.");

            }

        } while (opcion != 4);

        teclado.close();

    }

}
