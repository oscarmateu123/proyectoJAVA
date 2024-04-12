package proyecto;

import java.util.*;

public class principal {
    public static void main(String[] args) {
        int eleccion = 2;
        viaje actViaje = new viaje();
        curso actCurso = new curso();
        Scanner tec = new Scanner(System.in);

        while (eleccion != 3) {
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("1.Viajes");
            System.out.println("2.Cursos");
            System.out.println("3.Salir");
            eleccion = tec.nextInt();
            while (eleccion <= 0 || eleccion >= 4) {
                eleccion = tec.nextInt();
            }
            switch (eleccion) {
                case 1:
                    actViaje.menuViajes();
                    break;

                case 2:
                    actCurso.menuCurso();
                    break;
            }

        }

    }
}
