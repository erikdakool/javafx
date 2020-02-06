package org.openjfx.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.Timer;

public class _partialViewController {
    private static String path = "view/_logPartialView.fxml";
    @FXML
    private Label contractName;
    @FXML
    private Label vesselName;
    @FXML
    private Label projectName;
    @FXML
    private Hyperlink pob;
    @FXML
    private Hyperlink oprep;
    @FXML
    private AnchorPane insertionPoint;


    public void initialize() {
        //TITLE
        projectName.setText("Project::name");
        vesselName.setText("Vessel::name");
        contractName.setText("Contract::name");

        //ROUTER
        oprep.setOnMouseClicked(mouseEvent -> {
            path = "view/_logPartialView.fxml";
            System.out.println("Selected Operation Report!");
        });
        pob.setOnMouseClicked(mouseEvent -> {
            path = "view/inner2.fxml";
            System.out.println("Selected Personnel Onboard!");
        });

    }
    public static String getPath() {
        return path;
    }
}
