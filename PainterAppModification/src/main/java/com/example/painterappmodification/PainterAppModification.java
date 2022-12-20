package com.example.painterappmodification;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PainterAppModification extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));
        Scene scene=new Scene(root);
        stage.setTitle("Painter Application");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
