package co.edu.uniquindio.poo.proyectofinal.model;

public class Tratamiento {
    private Paciente paciente;
    private String informacion;

    public  Tratamiento(Paciente paciente, String informacion) {
        this.paciente = paciente;
        this.informacion = informacion;
    }

    //METODO GETTER Y SETTER

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
