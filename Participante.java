/*
 * Autor:Oscar Mateu
 * Descripcion: Aqui se apuntan todos los participantes.
 */
 class Participante extends Persona {
    private boolean inscrito;

    //Constructor
    public Participante(String nombre, String direccion, int edad, int telefono, String dni,boolean inscrito){
        super(nombre, direccion, edad, telefono, dni);
        this.inscrito=inscrito;
    }

    //SET-GET
    public boolean getInscrito(){
        return inscrito;
    }

    public void setInscrito(boolean inscrito){
        this.inscrito=inscrito;
    }

    @Override
    public String toString(){
        return "Nombre:" + getNombre() + "\n Dirección: " + getDireccion() + "\n Edad: "+ getEdad() + "\n Teléfno: "+ getTelefono() + "\n DNI: "+ getDni() + "\n Inscrito: " + getInscrito(); 
    }
}
