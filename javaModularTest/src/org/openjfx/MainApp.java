package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("bootstrap3overview.fxml"));

        Scene scene = new Scene(root);
         //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("JavaFX 13");
        stage.setScene(scene);
        stage.show();
    }

/*    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader outerLoader = new FXMLLoader(getClass().getResource("outer.fxml"));

        Scene scene = new Scene(outerLoader.load());

        //URL inner = getClass().getResource("inner1.fxml");
        URL inner = getClass().getResource("inner2.fxml");

        FXMLLoader innerLoader = new FXMLLoader(inner);

        // get insertion point from outer fxml
        innerLoader.setRoot(outerLoader.getNamespace().get("insertionPoint"));

        innerLoader.load();

        primaryStage.setScene(scene);
        primaryStage.show();
    }*/

    public static void main(String[] args) {
        launch(args);
    }

}
