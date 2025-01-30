package ru.ibragimov.pagetopage_ibragimov.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.ibragimov.pagetopage_ibragimov.util.Manager.showSecondScene;

public class MainController implements Initializable {

    @FXML
    private Button btn;

    @FXML
    void bat(ActionEvent event) {
showSecondScene("sec-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
btn.setStyle(("-fx-background-color:#20B2AA; -fx-background-radius:5px; -fx-text-fill:#ffffff"));
    }
}
