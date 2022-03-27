module com.example.testappfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testappfx to javafx.fxml;
    exports com.example.testappfx;
}