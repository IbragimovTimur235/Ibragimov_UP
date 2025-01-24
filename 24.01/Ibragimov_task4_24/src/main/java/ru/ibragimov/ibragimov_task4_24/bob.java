package ru.ibragimov.ibragimov_task4_24;

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
    private TextField vvodA;

    @FXML
    private TextField vvodB;

    @FXML
    void bat(ActionEvent event) {
        int a = Integer.parseInt(vvodA.getText());
        int b = Integer.parseInt(vvodB.getText());
        int k=-1;
        int d=0;
        if (a > b) {
            while (a>=d){
                k++;
                d=d+b;
          }
            viv.setText(String.valueOf(k));
        }
        else viv.setText(("a должно быть больше б"));

    }
}
