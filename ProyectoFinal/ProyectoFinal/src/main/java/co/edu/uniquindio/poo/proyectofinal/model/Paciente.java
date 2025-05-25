package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona implements IGestionPaciente{
    private HistorialMedico historialMedico;
    private List<CitaMedica> citas;
    private List<String> notificaciones;

    public Paciente(String nombre, String cedula, String correo, String edad) {
        super(nombre, cedula, correo, edad);
        this.historialMedico = new HistorialMedico("HIST-" + cedula, this);
        this.citas = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
    }

    //METODO PARA CREAR PACIENTE
    @Override
    public boolean agregarPaciente(String cedula, String nombre, String correo, String edad){
        for(Paciente paciente : Hospital.getListPacientes()) {
            if(paciente.getCedula().equals(cedula)){
                return false;
            }
        }
        Paciente newpaciente = new Paciente (nombre, cedula, correo, edad);
        Hospital.getListPacientes().add(newpaciente);
        return true;
    }

    //METODO PARA ACTUALIZAR DATOS
    @Override
    public boolean actualizarPaciente(String cedula, String nombre, String correo, String edad){
        boolean i = false;
        for(Paciente paciente : Hospital.getListPacientes()) {
            if(paciente.getCedula().equals(cedula)){
                paciente.setNombre(nombre);
                paciente.setEdad(edad);
                paciente.setCorreo(correo);
                i = true;
                break;
            }
        }
        return i;
    }


    // 2. Solicitud de cita médica
    public boolean solicitarCita(CitaMedica cita) {
        citas.add(cita);
        notificaciones.add("Cita solicitada para el " + cita.getFecha() + " con el Dr. " + cita.getMedico().getNombre());
        return true;
    }

    // 3. Cancelación de cita médica
    public boolean cancelarCita(CitaMedica cita) {
        for (CitaMedica citaMedica : citas) {
            if (citas.remove(cita)) {
                notificaciones.add("Cita cancelada para el " + cita.getFecha());
            }
        }
        return true;
    }

    // 4. Consulta del historial médico
    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    // 5. Recepción de notificaciones
    public void recibirNotificacion(String mensaje) {

        notificaciones.add(mensaje);
    }

    public List<String> getNotificaciones() {

        return notificaciones;
    }

    public List<CitaMedica> getCitas() {

        return citas;
    }
}
