package proyecto;

import java.util.*;

public class viaje {
    Scanner tec = new Scanner(System.in);
    ArrayList<String> destinos = new ArrayList<>();
    ArrayList<String> precios = new ArrayList<>();

    public viaje() {

    }

    public void menuViajes() {
        int elec = 1;
        while (elec != 4) {
            System.out.println("---MENU DE VIAJES---");
            System.out.println("1. Añadir viajes");
            System.out.println("2. Borrar viajes");
            System.out.println("3. Mirar todos los viajes");
            System.out.println("4. Salir");
            elec = tec.nextInt();
            while (elec >= 5 || elec <= 0) {
                elec = tec.nextInt();
            }

            switch (elec) {
                case 1:
                    añadirDestino(destinos, precios);
                    break;
                case 2:
                    borrarDestino(destinos, precios);
                    break;
                case 3:
                    mostrarTodo(destinos, precios);
                    break;

            }
        }
    }

    /*
     * public static void reservarViaje(ArrayList<String> destinos,
     * ArrayList<String> precios){
     * Scanner tec = new Scanner(System.in);
     * boolean reservado=false;
     * System.out.println("¿Escribe el nombre del lugar que quieras reservar");
     * String lugar = tec.nextLine();
     * for(int i=0; i<destinos.size(); i++){
     * if (destinos.get(i).equalsIgnoreCase(lugar)) {
     * reservado = true;
     * destinos.add(1, reservado);
     * }
     * }
     * }
     * pensaba añadir esto como otra opcion, pero la he descartado por
     * desconocimiento
     */

    public void mostrarTodo(ArrayList<String> destinos, ArrayList<String> precios) {
        if (destinos.isEmpty()) {
            System.out.println("No hay nada escrito");
        } else {
            for (int i = 0; i < destinos.size(); i++) {
                System.out.println("--------------------");
                System.out.println("Linea " + i);
                System.out.println("Destino: " + destinos.get(i));
                System.out.println("Coste: " + precios.get(i));
            }
            System.out.println();
        }
    }

    public void añadirDestino(ArrayList<String> destinos, ArrayList<String> precios) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Nombre del destino:");
        String dest = tec.nextLine();
        System.out.println("Precio del viaje para ese destino");
        String coste = tec.nextLine();
        destinos.add(dest);
        precios.add(coste);
    }

    public void borrarDestino(ArrayList<String> destinos, ArrayList<String> precios) {
        boolean encontrado = false;

        if (destinos.isEmpty()) {
            System.out.println("No hay nada escrito");
        } else {
            System.out.println("¿Cual quieres borrar?");
            String borrar = tec.nextLine();
            for (int i = 0; i < destinos.size(); i++) {
                if (destinos.get(i).equalsIgnoreCase(borrar)) {
                    destinos.remove(i);
                    precios.remove(i);
                    encontrado = true;
                }
            }
            if (encontrado == true) {
                System.out.println("Palabra borrada");
            } else if (encontrado == false) {
                System.out.println("Esa palabra no esta");
            }

        }
    }

}
