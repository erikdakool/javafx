package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.openjfx.controller._partialViewController;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader outerLoader = new FXMLLoader(getClass().getResource("view/report_view.fxml"));

        String path = _partialViewController.getPath();
        URL inner = getClass().getResource(path);

        Scene scene = new Scene(outerLoader.load());
         //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        FXMLLoader innerLoader = new FXMLLoader(inner);
        innerLoader.setRoot(outerLoader.getNamespace().get("insertionPoint"));
        innerLoader.load();

        stage.setTitle("DPR Software Prototype");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream( "image/deepoceanicon.png" )));
        stage.setScene(scene);
        stage.show();
    }

   /* @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader outerLoader = new FXMLLoader(getClass().getResource("view/report_view.fxml"));

        Scene scene = new Scene(outerLoader.load());

        //URL inner = getClass().getResource("inner1.fxml");
        URL inner = getClass().getResource("view/inner2.fxml");

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
