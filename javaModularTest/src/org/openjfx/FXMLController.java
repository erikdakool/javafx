package org.openjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
    
    @FXML
    private Label label;
    
    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");

        var model = new FXmodel();

        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        label.setText(model.title);
        System.out.println(model.getClass());
    }    
}
