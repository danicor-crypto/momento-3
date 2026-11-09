
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

                System.out.println("\nPrendas registradas:");

                for (int i = 0; i < lote.length; i++) {

                    if (lote[i] != null) {
                        System.out.println((i + 1) + ". " + lote[i]);
                    }

                }

            } else if (opcion == 2) {

                System.out.print("Ingrese el nombre de la prenda: ");
                String nombreBuscado = teclado.nextLine();

                boolean encontrado = nombreFuncion(lote, nombreBuscado);

                if (encontrado) {
                    System.out.println("La prenda sí existe.");
                } else {
                    System.out.println("La prenda no existe.");
                }

            } else if (opcion == 3) {

                System.out.print("Ingrese el nombre de la nueva prenda: ");
                String nuevaPrenda = teclado.nextLine();

                boolean guardada = false;

                for (int i = 0; i < lote.length; i++) {

                    if (lote[i] == null) {

                        lote[i] = nuevaPrenda;
                        guardada = true;

                        System.out.println("Prenda ingresada correctamente.");
                        break;

                    }

                }

                if (guardada == false) {
                    System.out.println("No hay espacios disponibles.");
                }

            } else if (opcion == 4) {

                System.out.println("Cerrando aplicación...");

            } else {

                System.out.println("Opción incorrecta.");

            }

        } while (opcion != 4);

        teclado.close();

    }

    public static boolean nombreFuncion(String[] lote, String nombreBuscado) {

        for (int i = 0; i < lote.length; i++) {

            if (lote[i] != null &&
                lote[i].equalsIgnoreCase(nombreBuscado)) {

                return true;

            }

        }

        return false;

    }

}
