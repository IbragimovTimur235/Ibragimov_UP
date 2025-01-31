package ru.ibragimov.ibragimov_task3_25;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class bob3 {

    @FXML
    private ListView<Integer> LV;

    @FXML
    private TextField TF;

    @FXML
    private Button btn;

    @FXML
    void but(ActionEvent event) {
int n=Integer.parseInt(TF.getText().toString());
int pl=1;
for(int ch=0; Math.pow(n,2)>ch; ch=ch+pl){
ch=ch+pl;
pl=pl+2;
LV.getItems().add(ch);
}
    }

}
