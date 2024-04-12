/*
 * Autor: Oscar Mateu
 * Descripcion: Aqui de apuntan todos los monitores.
 */
 class Monitor extends Persona  {
    private String curriculum;

    //Constructor
    public Monitor(String nombre, String direccion, int edad, int telefono, String dni, String curriculum){
        super(nombre, direccion, edad, telefono, dni);
        this.curriculum=curriculum;
    }

    //SET-GET
    public String getCurriculum(){
        return curriculum;
    }

    public void setCurriculum(String curriculum){
        this.curriculum=curriculum;  
    }


    @Override
    public String toString(){
        return "Nombre:" + getNombre() + "\n Dirección: " + getDireccion() + "\n Edad: "+ getEdad() + "\n Teléfno: "+ getTelefono() + "\n DNI: "+ getDni()+ "\n Inscrito:"+ getCurriculum(); 
    }
}
