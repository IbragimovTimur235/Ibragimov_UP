package ru.ibragimov.ibragimov_task3_24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class bob {

    @FXML
    private Button btn;

    @FXML
    private Label vivV;

    @FXML
    private Label vivg;

    @FXML
    private Label vivk;

    @FXML
    private Label vivp;

    @FXML
    private TextField vvodN;

    @FXML
    private TextField vvodZ;

    @FXML
    void bat(ActionEvent event) {
        int nam = Integer.parseInt(vvodN.getText());
        int Znach = Integer.parseInt(vvodZ.getText());
        double a=0;
        double c=0;
        double h=0;
        double s=0;
        switch (nam) {
            case (1):
                a = Double.parseDouble(vvodZ.getText());
                c = a * sqrt(2);
                h = c / 2;
                s=c * (h/2);
                break;
            case (2):
                c = Double.parseDouble(vvodZ.getText());
                a = c / sqrt(2);
                h = c / 2;
                s=c * (h/2);
                break;
            case (3):
                h = Double.parseDouble(vvodZ.getText());
                c = h * 2;
                a = c / sqrt(2);
                s=c * (h/2);
                break;
            case (4):
                s = Double.parseDouble(vvodZ.getText());
                c= s/4;
                h=c/2;
                a = c / sqrt(2);
                break;
        }
vivk.setText(String.valueOf(a));
vivg.setText(String.valueOf(c));
vivp.setText(String.valueOf(s));
vivV.setText(String.valueOf(h));
    }
//1 — катет a, 2 — гипотенуза c = a ∙ √2 , 3 — высота h,
//опущенная на гипотенузу (h=c/2), 4 — площадь S = c ∙ h/2.
}
