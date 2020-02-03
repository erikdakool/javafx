package org.openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;


public class ReportController {


    @FXML
    private Label projectName;
    @FXML
    private TableColumn from;
    @FXML
    private TableColumn to;
    @FXML
    private TableColumn desc;
    @FXML
    private TableColumn act;
    @FXML
    private TableColumn cost;

    @FXML
    private TableView<LogModel> logTable = new TableView<LogModel>();
    private final ObservableList<LogModel> data = FXCollections.observableArrayList(
            new LogModel("early", "late", "a custom description!", "act0", "cc01"),
            new LogModel("early", "late", "a custom description!", "act0", "cc01"),
            new LogModel("early", "late", "a custom description!", "act0", "cc01")
    );

    public void initialize() {
        projectName.setText("Ulykker På Afterparty På Charlie");
        from.setCellValueFactory(new PropertyValueFactory<LogModel, String>("from"));
        to.setCellValueFactory(new PropertyValueFactory<LogModel, String>("to"));
        desc.setCellValueFactory(new PropertyValueFactory<LogModel, String>("description"));
        act.setCellValueFactory(new PropertyValueFactory<LogModel, String>("actID"));
        cost.setCellValueFactory(new PropertyValueFactory<LogModel, String>("costCode"));

        logTable.setItems(data);
    }
}
