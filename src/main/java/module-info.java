module org.example.sesion9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sesion9 to javafx.fxml;
    exports org.example.sesion9;
}