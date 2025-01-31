package ru.ibragimov.ibragimov_task1_25;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

import java.util.List;

public class bobV {

    @FXML
    private Label Max;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btnO;

    @FXML
    private Label lb;

    @FXML
    private ListView<Integer> uchat;

    @FXML
    private TextField vvoduch;

    @FXML
    private Label yn;

    @FXML
    void bat1(ActionEvent event) {
        if (vvoduch.getText().isEmpty()) {
            return;
        }
        try {
            int u = Integer.parseInt((vvoduch.getText().toString()));
            uchat.getItems().add(u);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("введены некоректные денные");
            alert.showAndWait();
        } finally {
            vvoduch.setText("");
        }
    }

    @FXML
    void bat2(ActionEvent event) {
        List<Integer> data = uchat.getItems();
        int n= data.get(0);
        int max = 0;
        String s = "No";
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);
            if (m > max)
                max = m;
            if (m == 0)
                s = "Yes";


        }
        Max.setText(String.valueOf(max));
        yn.setText(s);
    }

    @FXML
    void batO(ActionEvent event) {
        Platform.exit();

    }

}
