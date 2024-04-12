/*
 * Autor:Oscar Mateu
 * Descripcion: Aqui se dan los metodos de todas las personas sin importar su funcion.
 */
public class Persona {
    
    //Atributos
    protected String nombre;
    protected String direccion;
    protected int edad;
    protected int telefono;
    protected String dni;

    //Constructor
    public Persona(){
        nombre=" ";
        direccion=" ";
        edad=0;
        telefono=0;
        dni=" ";
    }

    //Constructor Sobrecargado
    public Persona(String nombre, String direccion, int edad, int telefono, String dni){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
        this.telefono=telefono;
        this.dni=dni;
    }

    //GET-SET

    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    public String getDni(){
        return dni;
    }
     
    public void setDni(String dni){
        this.dni=dni;
    }

    

    /*void mostrar(){
        System.out.println("Nombre:" + getNombre());
        System.out.println("Direccion:" + getDireccion());
        System.out.println("Edad:" + getEdad());
        System.out.println("Telefono:" + getTelefono());
        System.out.println("Dni:" + getDni());
    }*/
}
