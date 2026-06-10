import java.util.Scanner;
public class Parkingsacarcoche {
// Método para sacar un coche
        public static void sacarCoche (String [] aparcamiento, String matricula) {
            Scanner parking = new Scanner(System.in);
            String matricula2 = aparcamiento[0];
            boolean coche = false;
            imprim("Ingresa la matricula para eliminar");
             matricula2 = parking.nextLine();
            for (int i = 0; i < aparcamiento.length; i++) {
                if (aparcamiento[i] != null) {
                    if (aparcamiento[i].equals(matricula2)) {
                        imprim("=============================================");
                        imprim("Sacando " + aparcamiento + " -> " + matricula2 + "... ");
                        aparcamiento[i] = null;
                        imprim("Se ha sacado el coche");
                        imprim("=============================================");
                        mostrarPlazas(aparcamiento);
                        coche = true;
                    }
                }
            }
            if (!coche) {
                System.out.println("No hay coche");
            }

        }
        public static void imprim (String message){
            System.out.println(message);
        }   
    }