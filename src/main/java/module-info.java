module com.example.modern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modern to javafx.fxml;
    exports com.example.modern;
}