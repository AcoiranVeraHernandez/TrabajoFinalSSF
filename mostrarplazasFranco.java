public static void mostrarPlazas(String[] plazas) {
    for (int i = 0; i < plazas.length; i++) {
        if (plazas[i] == null) {
            imprimir("Plaza " + i + ": Libre");
        } else {
            imprimir("Plaza " + i + ": " + plazas[i]);
        }
    }
}