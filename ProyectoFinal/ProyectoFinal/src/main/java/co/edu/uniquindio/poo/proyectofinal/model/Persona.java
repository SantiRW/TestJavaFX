package co.edu.uniquindio.poo.proyectofinal.model;

public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected String correo;
    protected String edad;
    public Persona(String nombre, String cedula, String correo, String edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.edad = edad;
    }

    //METODO GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setId(String text) {
    }
}
