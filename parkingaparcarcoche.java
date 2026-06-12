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
    imprimir("Ya se ocuparon todos los puestos del parking, vuelva más tarde");
    imprimir("=============================================");

    return false;
}