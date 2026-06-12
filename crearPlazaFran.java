public static String[] crearPlazas (){
        Scanner parking = new Scanner(System.in);
        String plazas=("");
        int opcion=0;
        boolean correcta=false;
        do {
            try {
                imprimir("Ingrese la plazas que quieres tener");
                plazas = parking.nextLine();
                opcion=Integer.parseInt(plazas);
                correcta=true;
            } catch (NumberFormatException e) {
                imprimir("Solo se puede ingresar los datos numericos");
            }
        }while (!correcta);
        imprimir("Ha introducido: "+plazas+" Plazas");

        String [] plaza=new String [opcion];
        plaza[0]="9878-CDF";
       return plaza;
    }