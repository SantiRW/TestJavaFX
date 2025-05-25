package co.edu.uniquindio.poo.proyectofinal.controller;

import co.edu.uniquindio.poo.proyectofinal.model.Paciente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CrudPacientesController {

    @FXML private TextField txtNombre, txtCedula, txtEdad, txtCorreo;
    @FXML private ComboBox<String> comboAccion;
    @FXML private TableView<Paciente> tablaPacientes;
    @FXML private TableColumn<Paciente, String> colNombre, colCedula, colEdad, colCorreo;

    private ObservableList<Paciente> listaPacientes = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        comboAccion.setItems(FXCollections.observableArrayList("Registrar", "Actualizar", "Eliminar"));

        colNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        colCedula.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCedula()));
        colEdad.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getEdad()));
        colCorreo.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCorreo()));

        tablaPacientes.setItems(listaPacientes);
    }

    @FXML
    private void ejecutarAccion() {
        String accion = comboAccion.getValue();
        if (accion == null) return;

        switch (accion) {
            case "Registrar" -> registrarPaciente();
            case "Actualizar" -> actualizarPaciente();
            case "Eliminar" -> eliminarPaciente();
        }
    }

    private void registrarPaciente() {
        Paciente paciente = new Paciente(
                txtNombre.getText(),
                txtCedula.getText(),
                txtEdad.getText(),
                txtCorreo.getText()
        );
        listaPacientes.add(paciente);
        limpiar();
    }

    private void actualizarPaciente() {
        Paciente seleccionado = tablaPacientes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            seleccionado.setNombre(txtNombre.getText());
            seleccionado.setCedula(txtCedula.getText());
            seleccionado.setEdad(txtEdad.getText());
            seleccionado.setCorreo(txtCorreo.getText());
            tablaPacientes.refresh();
            limpiar();
        }
    }

    private void eliminarPaciente() {
        Paciente seleccionado = tablaPacientes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            listaPacientes.remove(seleccionado);
            limpiar();
        }
    }

    private void limpiar() {
        txtNombre.clear();
        txtCedula.clear();
        txtEdad.clear();
        txtCorreo.clear();
        tablaPacientes.getSelectionModel().clearSelection();
    }
}
