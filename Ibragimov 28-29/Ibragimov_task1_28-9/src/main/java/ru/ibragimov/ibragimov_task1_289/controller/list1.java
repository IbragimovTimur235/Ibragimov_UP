package ru.ibragimov.ibragimov_task1_289.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static ru.ibragimov.ibragimov_task1_289.util.Manager.showMainStage;
import static ru.ibragimov.ibragimov_task1_289.util.Manager.showSecondScene;

public class list1 {

    @FXML
    private Button btn;

    @FXML
    void but(ActionEvent event) {
        showSecondScene( "list2.fxml", "Marathon Skills2016-Register as a runner");
    }

}
