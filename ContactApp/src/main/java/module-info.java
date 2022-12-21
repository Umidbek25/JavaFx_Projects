module com.example.contactapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.contactapp to javafx.fxml;
    exports com.example.contactapp;
}