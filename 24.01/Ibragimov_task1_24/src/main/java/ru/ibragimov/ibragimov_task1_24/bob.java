package ru.ibragimov.ibragimov_task1_24;

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
        int kk = Integer.parseInt(vvod.getText());
        String s = "ошибка";
        switch (kk) {
            case (1):
                s = "плохо";
                break;
            case (2):
                s = "неудовлетворительно";
                break;
            case (3):
                s = "неудовлетворительно";
                break;
            case (4):
                s = "хорошо";
                break;
            case (5):
                s = "отлично";
                break;
        }
        viv.setText(s);

    }

}

