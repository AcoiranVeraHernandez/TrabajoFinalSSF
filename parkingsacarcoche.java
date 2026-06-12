public static void sacarCoche(String[] aparcamiento) {

    Scanner parking = new Scanner(System.in);

    imprimir("Ingresa la matrícula para eliminar");
    String matricula = parking.nextLine();

    boolean coche = false;

    for (int i = 0; i < aparcamiento.length; i++) {

        if (aparcamiento[i] != null &&
            aparcamiento[i].equalsIgnoreCase(matricula)) {

            imprimir("=============================================");
            imprimir("Sacando coche con matrícula " + matricula + "...");
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