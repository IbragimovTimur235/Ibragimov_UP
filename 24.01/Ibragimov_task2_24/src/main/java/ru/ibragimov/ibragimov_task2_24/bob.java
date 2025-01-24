package ru.ibragimov.ibragimov_task2_24;

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
        int god = Integer.parseInt(vvod.getText());
        int des = god / 10;
        int ed = god % 10;
        String desS = "введите коректное число";
        String edS = "";
        if (god > 20 || god < 69) {
            switch (des) {
                case (2):
                    desS = "двадцать ";
                    break;
                case (3):
                    desS = "тридцать ";
                    break;
                case (4):
                    desS = "сорок ";
                    break;
                case (5):
                    desS = "пятьдесят ";
                    break;
                case (6):
                    desS = "шестьдесят ";
                    break;
            }
            switch (ed) {
                case (0):
                    edS = "лет";
                    break;
                case (1):
                    edS = "один год";
                    break;
                case (2):
                    edS = "два года";
                    break;
                case (3):
                    edS = "три года";
                    break;
                case (4):
                    edS = "четыре года";
                    break;
                case (5):
                    edS = "пять лет";
                    break;
                case (6):
                    edS = "шесть лет";
                    break;
                case (7):
                    edS = "семь лет";
                    break;
                case (8):
                    edS = "восемь лет";
                    break;
                case (9):
                    edS = "девять лет";
                    break;

            }
            viv.setText(desS + edS);
        }
    }

}
