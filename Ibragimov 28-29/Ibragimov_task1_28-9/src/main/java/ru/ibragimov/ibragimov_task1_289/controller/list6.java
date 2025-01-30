package ru.ibragimov.ibragimov_task1_289.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.ibragimov.ibragimov_task1_289.util.Manager.showMainStage;
import static ru.ibragimov.ibragimov_task1_289.util.Manager.showSecondScene;

public class list6 {

    @FXML
    private Button btn;

    @FXML
    void but(ActionEvent event) {
        showSecondScene("hello-view.fxml", "Marathon Skills2016");
    }

}
