package ru.ibragimov.pagetopage_ibragimov.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.ibragimov.pagetopage_ibragimov.util.Manager.showSecondScene;

public class Cont2 {

    @FXML
    private Button btn;

    @FXML
    void but(ActionEvent event) {
        showSecondScene("hello-view.fxml", "Marathon Skills 2016");
    }

}
