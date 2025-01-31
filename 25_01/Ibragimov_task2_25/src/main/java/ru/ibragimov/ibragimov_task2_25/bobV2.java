package ru.ibragimov.ibragimov_task2_25;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class bobV2 {

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
    private ListView<Integer> chisla;

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
            chisla.getItems().add(u);
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
        List<Integer> data = chisla.getItems();
        int n= data.get(0);
        int max = 0;
        int prom;
        int schet = 1;
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);
            prom=m;
            if (prom<10) {
                prom = prom / 10;
                schet++;
            }
            if (m > max && m%Math.pow(10,schet)==3)
                max = m;
        }
        Max.setText(String.valueOf(max));

    }

    @FXML
    void batO(ActionEvent event) {
        Platform.exit();

    }
    }
