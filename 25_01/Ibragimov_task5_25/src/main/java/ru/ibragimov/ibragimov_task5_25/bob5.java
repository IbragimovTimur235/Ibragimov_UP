package ru.ibragimov.ibragimov_task5_25;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class bob5 {

    @FXML
    private Button BTN;

    @FXML
    private Label L;

    @FXML
    private TextField TF;

    @FXML
    void but(ActionEvent event) {
int n=Integer.parseInt(TF.getText().toString());
double a=1;
double b=1;
double s=1;
for(int k=1;k<n;k++){
    double promA=a;
    s=s+b+a;
    a=1/2*(sqrt(b)+1/2*sqrt(a));
    b=2*pow(promA,2)+b;
}
L.setText(String.valueOf(s));
    }

}
