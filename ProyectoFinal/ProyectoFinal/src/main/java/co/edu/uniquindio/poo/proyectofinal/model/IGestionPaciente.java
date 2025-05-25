package co.edu.uniquindio.poo.proyectofinal.model;

public interface IGestionPaciente {
    boolean agregarPaciente(String cedula, String nombre, String correo, String edad);
    boolean actualizarPaciente(String cedula, String nombre, String correo, String edad);


}
