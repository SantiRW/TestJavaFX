module co.edu.uniquindio.poo.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinal;
    exports co.edu.uniquindio.poo.proyectofinal.viewController;
    opens co.edu.uniquindio.poo.proyectofinal.viewController to javafx.fxml;
}