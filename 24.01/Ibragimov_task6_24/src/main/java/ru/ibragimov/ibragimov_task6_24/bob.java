package ru.ibragimov.ibragimov_task6_24;

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
    private TextField vvod;

    @FXML
    void bat(ActionEvent event) {
        int ch = Integer.parseInt(vvod.getText());
        int k = 0;
        int f = 0;
        while (ch > 10) {
            k = k + 1;
            f = f + (ch % 10);
            ch = ch / 10;
        }
        f=f+ch;
        k++;
        viv.setText("кол-во:" + k + " сумма:" + f);
    }

}
