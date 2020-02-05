package org.openjfx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.openjfx.model.LogModel;


public class ReportController {

    @FXML
    private TextField addFrom;
    public TextField addTo;
    public TextArea addDesc;
    public TextField addAct;
    public TextField addCost;
    public Button addButton;

    @FXML
    private TableColumn<LogModel, String> from;
    @FXML
    private TableColumn<LogModel, String> to;
    @FXML
    private TableColumn<LogModel, String> desc;
    @FXML
    private TableColumn<LogModel, String> act;
    @FXML
    private TableColumn<LogModel, String> cost;

    @FXML
    private TableView<LogModel> logTable = new TableView<LogModel>();
    private final ObservableList<LogModel> data = FXCollections.observableArrayList();

    public void initialize() {
        from.setCellValueFactory(new PropertyValueFactory<>("from"));
        to.setCellValueFactory(new PropertyValueFactory<>("to"));
        desc.setCellValueFactory(new PropertyValueFactory<>("description"));
        act.setCellValueFactory(new PropertyValueFactory<>("actID"));
        cost.setCellValueFactory(new PropertyValueFactory<>("costCode"));

        logTable.setItems(data);

        addButton.setOnMouseClicked(mouseEvent -> {
            addLogEntry();
            System.out.println("Adding to table!");
            logTable.setItems(data);
        });
    }
    public void addLogEntry() {
        data.add(new LogModel(
           addFrom.getText(),
           addTo.getText(),
           addDesc.getText(),
           addAct.getText(),
           addCost.getText()
        ));
        clearAddLogInputs();
    }

    public void clearAddLogInputs() {
        addFrom.clear();
        addTo.clear();
        addDesc.clear();
        addAct.clear();
        addCost.clear();
    }

}
