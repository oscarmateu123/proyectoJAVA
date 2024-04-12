/*
 * Autor:Oscar Mateu
 * Descripcion: Main del programa ahora usando ArrayList, aqui se apuntaran todo lo que se necesite.
 * Apuntes:Va todo menos el agragar participantes.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);

        ArrayList<Participante> participantes=new ArrayList<Participante>();
        ArrayList<Monitor> monitores=new ArrayList<Monitor>();
        ArrayList<Actividad> actividades=new ArrayList<Actividad>();

        int opcion=10;

        while (opcion !=0) {
            System.out.println("\n 0).Salir    \n 1).Crear Participante    \n 2).Crear Monitor    \n 3).Crear Actividad  \n 4).Mostrar Participantes    \n 5).Mostrar Monitores     \n 6).Mostrar Actividades");
            opcion=tec.nextInt();
        tec.nextLine();

        switch (opcion) {
        case 1:
            System.out.println("Añade un Participante. \n Para introducir el participante, indicas su nombre, dirección, edad, teléfono, DNI y su estado de inscripción en líneas diferentes");
            participantes.add(new Participante(
            tec.nextLine(), //Nombre
            tec.nextLine(), //Dirección
            tec.nextInt(),  //Edad
            tec.nextInt(), //Teléfono
            tec.nextLine(), //DNI
            tec.nextBoolean())); //Inscrito
            tec.nextLine();
            break;

        case 2:
            System.out.println("Añade un Monitor. \n Para introducir el monitor, indicas su nombre, dirección, edad, teléfono, DNI y Curriculum en líneas diferentes");
            monitores.add(new Monitor(
                tec.nextLine(), //Nombre
                tec.nextLine(), //Dirección
                tec.nextInt(),  //Edad
                tec.nextInt(), //Teléfono
                tec.nextLine(),  //DNI
                tec.nextLine())); //Curriculum
            tec.nextLine(); 
            break;
    
            case 3:
            System.out.println("Añade una Actividad. \n Para introducir una actividad, indicas su nombre, descripción, horas, coste, cuota, mínimo y máximo de participantes en líneas diferentes");
            actividades.add(new Actividad(
                tec.nextLine(), //Nombre 
                tec.nextLine(), //Descripción
                tec.nextInt(),  //Horas
                tec.nextDouble(),  //Coste
                tec.nextDouble(),  //Cuota
                tec.nextInt(),  //Minimo Participantes
                tec.nextInt())); //Máximo Participantes
                tec.nextLine();
            break;
    
            case 4:
                System.out.println("¿Qué Participante quieres ver?");
                for (int i = 0; i < participantes.size(); i++) {
                    System.out.println("Para ver los datos del participante, escribe el número del participante en su orden de escritura");
                    int buscar = tec.nextInt();
                    System.out.println(participantes.get(buscar));
                }
            break;

            case 5:
                System.out.println("¿Qué Monitor quieres ver?");
                for (int i = 0; i < monitores.size(); i++) {
                    System.out.println("Para ver los datos del monitor, escribe el número del monitor en su orden de escritura");
                    int buscar = tec.nextInt();
                    System.out.println(monitores.get(buscar));
                }
            break;

            case 6:
            System.out.println("¿Que Actividad quieres ver?");
            for(int i=0;i<actividades.size();i++){
                System.out.println("Para ver los datos de la Actividad, escribe el número de la actividad en su orden de escritura");
                    int buscar = tec.nextInt();
                    System.out.println(actividades.get(buscar));
            }
            break;
        }
        }


        
        
        
        
        
        /*Monitor monitor=new Monitor("Pepe", "Av Cid 12", 22, 622144584, "124774134A", "Curriculum");
        Participante participante=new Participante("Oscar", "Av. Colon 25", 18, 622606416, "54741417Z", false);
        Actividad actividad=new Actividad("Curso", "Descripcion", 36, 1200.15, 30.50, 16, 36);

        System.out.println("Monitor");
        monitor.mostrar();

        System.out.println();

        System.out.println("Participante");
        participante.mostrar();

        System.out.println();

        System.out.println("Actividad");
        actividad.mostrar();*/
        
    }
}
