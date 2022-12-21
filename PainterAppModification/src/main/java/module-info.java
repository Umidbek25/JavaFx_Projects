module com.example.painterappmodification {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.painterappmodification to javafx.fxml;
    exports com.example.painterappmodification;
}