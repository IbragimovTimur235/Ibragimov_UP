package ru.ibragimov.ibragimov_task4_25;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class bob {

    @FXML
    private Button btn;

    @FXML
    private Label viv;

    @FXML
    private TextField vvA;

    @FXML
    private TextField vvB;

    @FXML
    void bat(ActionEvent event) {
double A= Double.parseDouble(vvA.getText());
double N= Double.parseDouble(vvB.getText());
double s=1;
for(int b = 0; b<N; b++){
s=s*A;
}
viv.setText(String.valueOf(s));
    }

}
