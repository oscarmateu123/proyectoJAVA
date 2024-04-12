package proyecto;

public class usuario {
    private String nombre;
    private String dni;
    private boolean matriculado = false;

    public void usuario() {
        this.nombre = nombre;
        this.dni = dni;
        this.matriculado = matriculado;
    }

    public String getDatos() {
        return nombre + " " + dni + " " + matriculado;
    }

}
