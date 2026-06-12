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