package org.openjfx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import org.openjfx.model.EquipmentModel;
import org.openjfx.model.LogModel;


public class ReportController {
    //LOG CONTROLS
    @FXML
    private TextField addFrom;
    @FXML
    private TextField addTo;
    @FXML
    private TextArea addDesc;
    @FXML
    private TextField addAct;
    @FXML
    private TextField addCost;
    @FXML
    private Button addButton;

    //EQUIPMENT CONTROLS
    @FXML
    private TextField addEDesc;
    @FXML
    private TextField addEQuant;
    @FXML
    private DatePicker addEOn;
    @FXML
    private DatePicker addEOff;
    @FXML
    private ComboBox addERate;
    @FXML
    private ComboBox addEOwner;
    @FXML
    private ComboBox addETask;
    @FXML
    private Button addEButton;
    @FXML
    private AnchorPane equipControls;

    //LOG TABLE
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
    private final ObservableList<LogModel> logData = FXCollections.observableArrayList();

    //EQUIPMENT TABLE
    @FXML
    private TableColumn<EquipmentModel, String> equipDesc;
    @FXML
    private TableColumn<EquipmentModel, String> equipQuant;
    @FXML
    private TableColumn<EquipmentModel, String> equipOwner;
    @FXML
    private TableColumn<EquipmentModel, String> equipOn;
    @FXML
    private TableColumn<EquipmentModel, String> equipOff;
    @FXML
    private TableColumn<EquipmentModel, String> equipRate;
    @FXML
    private TableColumn<EquipmentModel, String> taskNum;
    @FXML
    private TableView<EquipmentModel> equipTable = new TableView<EquipmentModel>();
    private final ObservableList<EquipmentModel> equipData = FXCollections.observableArrayList();


    public void initialize() {
        //LOG TABLE
        from.setCellValueFactory(new PropertyValueFactory<>("from"));
        to.setCellValueFactory(new PropertyValueFactory<>("to"));
        desc.setCellValueFactory(new PropertyValueFactory<>("description"));
        act.setCellValueFactory(new PropertyValueFactory<>("actID"));
        cost.setCellValueFactory(new PropertyValueFactory<>("costCode"));
        logTable.setItems(logData);

        addButton.setOnMouseClicked(mouseEvent -> {
            addLogEntry();
            System.out.println("Adding to table!");
            logTable.setItems(logData);
        });
        //EQUIPMENT TABLE
        equipDesc.setCellValueFactory(new PropertyValueFactory<>("description"));
        equipQuant.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        equipOwner.setCellValueFactory(new PropertyValueFactory<>("owner"));
        equipOn.setCellValueFactory(new PropertyValueFactory<>("dateOn"));
        equipOff.setCellValueFactory(new PropertyValueFactory<>("dateOff"));
        equipRate.setCellValueFactory(new PropertyValueFactory<>("rate"));
        taskNum.setCellValueFactory(new PropertyValueFactory<>("taskNumber"));
        equipTable.setItems(equipData);

        addEButton.setOnMouseClicked(mouseEvent -> {
            AddEquipmentEntry();
            System.out.println("Adding to table!");
            equipTable.setItems(equipData);
        });
    }
    //LOG CONTROLS TO MODEL LIST
    public void addLogEntry() {
        logData.add(new LogModel(
           addFrom.getText(),
           addTo.getText(),
           addDesc.getText(),
           addAct.getText(),
           addCost.getText()
        ));
        addFrom.clear();
        addTo.clear();
        addDesc.clear();
        addAct.clear();
        addCost.clear();
    }

    //EQUIPMENT CONTROLS TO EQUIPMENT LIST
    public void AddEquipmentEntry() {
        equipData.add(new EquipmentModel(
                addEDesc.getText(),
                addEQuant.getText(),
                addEOwner.getValue().toString(),
                addEOn.getValue().toString(),
                addEOff.getValue().toString(),
                addERate.getValue().toString(),
                addETask.getValue().toString()
        ));
        addEQuant.clear();
        addEDesc.clear();
    }


}
