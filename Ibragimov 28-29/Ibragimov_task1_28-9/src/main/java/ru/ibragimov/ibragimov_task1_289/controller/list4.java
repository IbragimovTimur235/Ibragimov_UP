package ru.ibragimov.ibragimov_task1_289.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

import static ru.ibragimov.ibragimov_task1_289.util.Manager.showSecondScene;

public class list4 {

    @FXML
    private TextField TFPpass;

    @FXML
    private TextField TFmail;

    @FXML
    private TextField TFpass;

    @FXML
    private Button btn;

    @FXML
    private Button btn2;
static String M="нет", p="нет", pp;
    @FXML
    void butCancel(ActionEvent event) {
        showSecondScene( "list2.fxml", "Marathon Skills2016-Register as a runner");
    }

    @FXML
    void butLogin(ActionEvent event) {
M=TFmail.getText();
p=TFpass.getText();
pp=TFPpass.getText();
if (Objects.equals(p, pp)){
    showSecondScene( "list3.fxml", "Marathon Skills2016-Login");
}
else {
    TFPpass.setText("пароль не совпадает");
}
    }

}
