package proyecto;

import java.util.*;

public class curso {

    static Scanner tec = new Scanner(System.in);
    ArrayList<String> cursoNombre = new ArrayList<String>();
    ArrayList<String> alumnos = new ArrayList<String>();

    public curso() {
    }

    public void menuCurso() {
        int elec = 1;
        while (elec != 2) {
            System.out.println("---MENU DE CURSOS---");
            System.out.println("1.Añadir un curso");
            System.out.println("2. Salir");
            elec = tec.nextInt();
            while (elec >= 3 || elec <= 0) {
                elec = tec.nextInt();
            }
            switch (elec) {
                case 1:
                    aniadirCursos(cursoNombre);
                    break;

            }
        }
    }

    public static void aniadirCursos(ArrayList<String> cursoNombre) {
        String dist = "a";
        System.out.println("Escribe el nombre de los cursos");
        System.out.println("Pon * para salir");
        while (!dist.equals("*")) {
            dist = tec.nextLine();
            cursoNombre.add(dist);
        }
    }
}
