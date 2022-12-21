module com.example.contactsappmodification {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.contactsappmodification to javafx.fxml;
    exports com.example.contactsappmodification;
}