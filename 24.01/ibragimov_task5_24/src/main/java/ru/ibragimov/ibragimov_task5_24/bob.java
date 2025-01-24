package ru.ibragimov.ibragimov_task5_24;

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
double p=Double.parseDouble(vvod.getText());
if (p>0&&p<50){
p=1+p/10;
double s=100;
int k=0;
while (s<=200){
    s=s*p;
    k++;
}
    viv.setText(k+" дн., "+ s+" км");
}
else {
    viv.setText("проц. должен быть в диапазоне от 1 до 49 вкл.");
}
    }

}
