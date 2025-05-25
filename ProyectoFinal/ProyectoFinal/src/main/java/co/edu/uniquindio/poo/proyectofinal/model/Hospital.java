package co.edu.uniquindio.poo.proyectofinal.model;

import co.edu.uniquindio.poo.proyectofinal.model.*;

import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private ArrayList<Administrador> listaAdministradores;
    private static ArrayList<Medico> listMedicos;
    public static ArrayList<Paciente> listPacientes;
    private ArrayList<CitaMedica> listCitas;
    private ArrayList<HistorialMedico> listHistorialesMedicos;
    private ArrayList<Diagnostico> listDiagnosticos;
    private ArrayList<Tratamiento> listTratamientos;

    public Hospital(String nombre){
        this.nombre = nombre;
    }

    //METODO PARA CREAR ADMINS
    public boolean crearAdmin(String nombre, String cedula, String correo, String edad){
        boolean i = true;
        for(Administrador admin : listaAdministradores){
            if(admin.getCedula().equals(cedula)){
                i = false;
                break;
            }
            if(i){
                Administrador newAdmin = new Administrador(nombre, cedula, correo, edad);
                listaAdministradores.add(newAdmin);
            }
        }
        return i;
    }

    //METODO PARA ELIMINAR ADMIN
    public boolean eliminarAdmin(String cedula) {
        boolean i = false;
        for (Administrador admin : listaAdministradores) {
            if (admin.getCedula().equals(cedula)) {
                listaAdministradores.remove(admin);
                i = true;
            }
        }
        return i;
    }

    //METODO PARA ACTUALIZAR ADMIN
    public boolean actulizarAdmin(String nombre, String cedula, String correo, String edad){
        boolean i = false;
        for (Administrador admin : listaAdministradores) {
            if (admin.getCedula().equals(cedula)) {
                admin.setNombre(nombre);
                admin.setCorreo(correo);
                admin.setEdad(edad);
                i = true;
            }
        }
        return i;
    }

    //METODO PARA BUSCAR ADMIN
    public Administrador buscarAdmin(String cedula){
        for (Administrador admin : listaAdministradores) {
            if (admin.getCedula().equals(cedula)) {
                return admin;
            }
        }
        return null;
    }

    //METOD PARA CREAR HISTORIAL MEDICO

    //METODO PARA ASIGNAR ID HISTORIALMEDICO

    //METODO GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    public static ArrayList<Medico> getListMedicos() {

        return listMedicos;
    }

    public void setListMedicos(ArrayList<Medico> listMedicos) {

        this.listMedicos = listMedicos;
    }

    public static ArrayList<Paciente> getListPacientes() {

        return listPacientes;
    }

    public void setListPacientes(ArrayList<Paciente> listPacientes) {

        this.listPacientes = listPacientes;
    }

    public ArrayList<CitaMedica> getListCitas() {

        return listCitas;
    }

    public void setListCitas(ArrayList<CitaMedica> listCitas) {

        this.listCitas = listCitas;
    }

    public ArrayList<HistorialMedico> getListHistorialesMedicos() {

        return listHistorialesMedicos;
    }

    public void setListHistorialesMedicos(ArrayList<HistorialMedico> listHistorialesMedicos) {
        this.listHistorialesMedicos = listHistorialesMedicos;
    }

    public ArrayList<Diagnostico> getListDiagnosticos() {

        return listDiagnosticos;
    }

    public void setListDiagnosticos(ArrayList<Diagnostico> listDiagnosticos) {
        this.listDiagnosticos = listDiagnosticos;
    }

    public ArrayList<Tratamiento> getListTratamientos() {

        return listTratamientos;
    }

    public void setListTratamientos(ArrayList<Tratamiento> listTratamientos) {
        this.listTratamientos = listTratamientos;
    }
}

