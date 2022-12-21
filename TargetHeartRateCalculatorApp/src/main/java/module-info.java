module com.example.targetheartratecalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.targetheartratecalculatorapp to javafx.fxml;
    exports com.example.targetheartratecalculatorapp;
}