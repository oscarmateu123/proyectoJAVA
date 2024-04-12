/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lliurex
 */
/**
 * Autor: Oscar Mateu
 * Descripcion: Aqui se dan todos los datos de la actividad que se quiera realizar.
 */
public class Actividad {

    //Atributos
    private String nombre;
    private String descripcion;
    private int horas;
    private double coste;
    private double cuota;
    private int maxParti;
    private int minParti;


    //Constructor
    public Actividad(){
    nombre=" ";
    descripcion=" ";
    horas=0;
    coste=0.0;
    cuota=0.0;
    maxParti=0;
    minParti=0;
 }

    //Constructor Sobrecargado
    public Actividad(String nombre, String descripcion, int horas, double coste, double cuota, int maxParti, int minParti ){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.horas=horas;
        this.coste=coste;
        this.cuota=cuota;
        this.maxParti=maxParti;
        this.minParti=minParti;
    }

    //GET-SET
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
         this.nombre=nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
         this.descripcion=descripcion;
    }

    public int getHoras(){
        return horas;
    }

    public void setHoras(int horas){
         this.horas=horas;
    }

    public double getCoste(){
        return coste;
    }

    public void setCoste(double coste){
         this.coste=coste;
    }
    
    public double getCuota(){
        return cuota;
    }

    public void setCuota(double cuota){
         this.cuota=cuota;
    }

    public int getMaxParti(){
        return maxParti;
    }

    public void setMaxParti(int maxParti){
         this.maxParti=maxParti;
    }

    public int getMinParti(){
        return minParti;
    }

    public void setMinParti(int minParti){
        this.minParti=minParti;
    }

    public String toString(){
        return "Nombre:" + getNombre() + "\n Descripción: " + getDescripcion() + "\n Horas: "+ getHoras() + "\n Coste: "+ getCoste() + "\n Cuota: "+ getCuota() + "\n Máximo Participantes: " + getMinParti() + "\n Mínimo Participantes: "+ getMaxParti(); 
    }
    
    
    /*//Mostrar
    public void mostrar(){
        System.out.println("Nombre:" + getNombre());
        System.out.println("Descripcion:" + getDescripcion());
        System.out.println("Horas:" + getHoras());
        System.out.println("Coste:" + getCoste());
        System.out.println("Cuota:" + getCuota());
        System.out.println("Maximo Participantes:" + getMaxParti());
        System.out.println("Minimo Participantes:" + getMinParti());
    } */
}
