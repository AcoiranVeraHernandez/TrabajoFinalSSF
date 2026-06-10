public static boolean aparcarCoche(String[] aparcamiento, String matricula) {
        Scanner parking = new Scanner(System.in);
        for (int i = 0; i <aparcamiento.length; i++) {
            if (aparcamiento[i] == null) {
                 aparcamiento[i]= matricula;
                imprim("Plazas actualizadas");
                imprim("=============================================");
                mostrarPlazas(aparcamiento);
                return true;
            } else {
                imprim("=============================================");
                imprim("Ya se ocuparon todos los puestos del parking, vuelva más tarde");
                imprim("=============================================");
            }
        }
        return false;