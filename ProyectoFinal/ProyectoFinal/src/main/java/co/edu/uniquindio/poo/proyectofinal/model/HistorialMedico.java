package co.edu.uniquindio.poo.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private String id;
    private Paciente paciente;
    private List<String> entradas; // diagnósticos y tratamientos

    public HistorialMedico(String id, Paciente paciente) {
        this.id = id;
        this.paciente = paciente;
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(String diagnostico, String tratamiento) {
        String entrada = "Diagnóstico: " + diagnostico + " | Tratamiento: " + tratamiento;
        entradas.add(entrada);
    }

    public List<String> getEntradas() {
        return entradas;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
