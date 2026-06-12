import java.util.InputMismatchException;
import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        String[] plazas = crearPlazas();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            imprimir("\n===== MENÚ =====");
            imprimir("1. Mostrar plazas");
            imprimir("2. Aparcar coche");
            imprimir("3. Sacar coche");
            imprimir("0. Salir");
            imprimir("Seleccione una opción:");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    mostrarPlazas(plazas);
                    break;

                case 2:
                    imprimir("Introduce la matrícula:");
                    String matricula = sc.nextLine();
                    aparcarCoche(plazas, matricula);
                    break;

                case 3:
                    sacarCoche(plazas);
                    break;

                case 0:
                    imprimir("Saliendo...");
                    break;

                default:
                    imprimir("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static String[] crearPlazas() {

        Scanner parking = new Scanner(System.in);
        String plazas = "";
        int opcion = 0;
        boolean correcta = false;

        do {
            try {
                imprimir("Ingrese las plazas que quieres tener");
                plazas = parking.nextLine();
                opcion = Integer.parseInt(plazas);
                correcta = true;
            } catch (NumberFormatException e) {
                imprimir("Solo se pueden ingresar datos numéricos");
            }
        } while (!correcta);

        imprimir("Ha introducido: " + plazas + " plazas");

        return new String[opcion];
    }

    public static void mostrarPlazas(String[] plazas) {

        imprimir("\n===== ESTADO DEL PARKING =====");

        for (int i = 0; i < plazas.length; i++) {

            if (plazas[i] == null) {
                imprimir("Plaza " + i + ": Libre");
            } else {
                imprimir("Plaza " + i + ": " + plazas[i]);
            }
        }
    }

    public static boolean aparcarCoche(String[] aparcamiento, String matricula) {

        for (int i = 0; i < aparcamiento.length; i++) {

            if (aparcamiento[i] == null) {

                aparcamiento[i] = matricula;

                imprimir("Plazas actualizadas");
                imprimir("=============================================");
                mostrarPlazas(aparcamiento);

                return true;
            }
        }

        imprimir("=============================================");
        imprimir("Ya se ocuparon todos los puestos del parking");
        imprimir("=============================================");

        return false;
    }

    public static void sacarCoche(String[] aparcamiento) {

        Scanner parking = new Scanner(System.in);

        imprimir("Ingresa la matrícula para eliminar");
        String matricula = parking.nextLine();

        boolean coche = false;

        for (int i = 0; i < aparcamiento.length; i++) {

            if (aparcamiento[i] != null &&
                    aparcamiento[i].equalsIgnoreCase(matricula)) {

                imprimir("=============================================");
                imprimir("Sacando coche con matrícula " + matricula);
                aparcamiento[i] = null;
                imprimir("Se ha sacado el coche");
                imprimir("=============================================");

                mostrarPlazas(aparcamiento);

                coche = true;
                break;
            }
        }

        if (!coche) {
            imprimir("No hay ningún coche con esa matrícula");
        }
    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}