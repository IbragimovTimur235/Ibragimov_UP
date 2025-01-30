package ru.ibragimov.ibragimov_task1_289.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.ibragimov.ibragimov_task1_289.util.Manager.showSecondScene;

public class list2 {

    @FXML
    private Button btn;

    @FXML
    private Button btn2;

    @FXML
    void but(ActionEvent event) {
        showSecondScene( "list3.fxml", "Marathon Skills2016-Login");
    }

    @FXML
    void but2(ActionEvent event) {
        showSecondScene( "list4.fxml", "Marathon Skills2016-Register as a runner");
    }

}
