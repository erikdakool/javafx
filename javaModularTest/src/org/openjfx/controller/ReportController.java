package org.openjfx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.openjfx.model.LogModel;


public class ReportController {


    public TextField addFrom;
    public TextField addTo;
    public TextField addDesc;
    public TextField addAct;
    public TextField addCost;
    public Button addButton;
    @FXML
    private Label projectName;
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
    private final ObservableList<LogModel> data = FXCollections.observableArrayList(
            new LogModel("1", "2", "a custom description!", "act0", "cc01"),
            new LogModel("2", "3", "a custom description!", "act0", "cc01"),
            new LogModel("3", "4", "a custom description!", "act0", "cc01")
    );

    public void initialize() {
        projectName.setText("Project::name");
        from.setCellValueFactory(new PropertyValueFactory<LogModel, String>("from"));
        to.setCellValueFactory(new PropertyValueFactory<LogModel, String>("to"));
        desc.setCellValueFactory(new PropertyValueFactory<LogModel, String>("description"));
        act.setCellValueFactory(new PropertyValueFactory<LogModel, String>("actID"));
        cost.setCellValueFactory(new PropertyValueFactory<LogModel, String>("costCode"));

        logTable.setItems(data);

        addButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                addLogEntry();
                System.out.println("Adding to table!");
                logTable.setItems(data);
            }
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
