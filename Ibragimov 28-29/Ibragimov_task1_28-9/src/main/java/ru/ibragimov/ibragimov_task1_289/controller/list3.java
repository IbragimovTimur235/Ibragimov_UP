package ru.ibragimov.ibragimov_task1_289.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

import static ru.ibragimov.ibragimov_task1_289.controller.list4.M;
import static ru.ibragimov.ibragimov_task1_289.controller.list4.p;
import static ru.ibragimov.ibragimov_task1_289.util.Manager.showSecondScene;

public class list3 {

    @FXML
    private TextField TFmail;

    @FXML
    private TextField TFpass;

    @FXML
    private Button btn;

    @FXML
    private Button btn2;

    @FXML
    void butCancel(ActionEvent event) {
        showSecondScene( "list2.fxml", "Marathon Skills2016-Register as a runner");
    }

    @FXML
    void butLogin(ActionEvent event) {
String Mail=TFmail.getText();
String pass=TFpass.getText();
if(Objects.equals(M, Mail) && Objects.equals(p,pass)){
    showSecondScene( "list5.fxml", "Marathon Skills2016-Register for an event");
}
else {
    TFpass.setText("логин или пароль не совпадает");
}

    }

}
