package ru.ibragimov.ibragimov31task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Label;
import javafx.scene.control.Label;

import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage Pereh;
    private Scene scenet1;
    private Scene scenet2;
    private Scene scenet3;
    private Scene scenet4;

    @Override
    public void start(Stage stage) throws IOException {
        Pereh = stage;
        scenet1 = createScene1();
        scenet2 = createScene2();
        scenet3 = createScene3();
        scenet4 = createScene4();
        Pereh.setTitle("практическая часть");
        Pereh.setScene(scenet1);
        Pereh.show();
    }

    private Scene createScene1() {
        Label tit = new Label("Task1");
        tit.setStyle("-fx-font-size:20px;-fx-font-weight:bold");
        TextField R1 = new TextField();
        TextField R2 = new TextField();
        Button calck = new Button("найти");
        Label res1 = new Label("ответ");
        Label res2 = new Label("ответ");
        Label res3 = new Label("ответ");
        calck.setOnAction(www -> {
            int r1 = Integer.parseInt(R1.getText());
            int r2 = Integer.parseInt(R2.getText());
            if (r1 > r2) {
                double s1 = PI * pow(r1, 2);
                double s2 = PI * pow(r2, 2);
                double s3 = s1 - s2;
                res1.setText(String.valueOf(s1));
                res2.setText(String.valueOf(s2));
                res3.setText(String.valueOf(s3));
            } else {
                res1.setText("условие!!!");
                res2.setText("условие!!!");
                res3.setText("условие!!!");
            }
        });
        Button z1 = new Button("1");
        Button z2 = new Button("2");
        Button z3 = new Button("3");
        Button z4 = new Button("4");
        z1.setOnAction(event -> Pereh.setScene(scenet1));
        z2.setOnAction(event -> Pereh.setScene(scenet2));
        z3.setOnAction(event -> Pereh.setScene(scenet3));
        z4.setOnAction(event -> Pereh.setScene(scenet4));
        HBox knopper = new HBox(10, z1, z2, z3, z4);
        knopper.setAlignment(Pos.CENTER);
        HBox vvod = new HBox(10, new Label("R1="), R1, new Label("R2="), R2);
        vvod.setAlignment(Pos.CENTER);
        HBox res = new HBox(10, new Label("S1="), res1, new Label("S2="), res2, new Label("S3="), res3);
        res.setAlignment(Pos.CENTER);
        VBox ob = new VBox(20, tit, vvod, calck, res, knopper);
        ob.setAlignment(Pos.CENTER);
        ob.setPadding(new Insets(20));
        return new Scene(ob, 500, 500);
    }

    private Scene createScene2() {
        Label tit = new Label("Task2");
        tit.setStyle("-fx-font-size:20px;-fx-font-weight:bold");
        TextField R1 = new TextField();
        Button calck = new Button("найти");
        Label res1 = new Label("ответ");
        calck.setOnAction(www -> {
            int x = Integer.parseInt(R1.getText());
            double y = 4 * pow((x - 3), 6) - 7 * pow((x - 3), 6) + 2;
            res1.setText(String.valueOf(y));
        });
        Button z1 = new Button("1");
        Button z2 = new Button("2");
        Button z3 = new Button("3");
        Button z4 = new Button("4");
        z1.setOnAction(event -> Pereh.setScene(scenet1));
        z2.setOnAction(event -> Pereh.setScene(scenet2));
        z3.setOnAction(event -> Pereh.setScene(scenet3));
        z4.setOnAction(event -> Pereh.setScene(scenet4));
        HBox knopper = new HBox(10, z1, z2, z3, z4);
        knopper.setAlignment(Pos.CENTER);
        HBox vvod = new HBox(10, new Label("X="), R1);
        vvod.setAlignment(Pos.CENTER);
        HBox res = new HBox(10, new Label("Y="), res1);
        res.setAlignment(Pos.CENTER);
        VBox ob = new VBox(20, tit, vvod, calck, res, knopper);
        ob.setAlignment(Pos.CENTER);
        ob.setPadding(new Insets(20));
        return new Scene(ob, 500, 500);
    }

    private Scene createScene3() {
        Label tit = new Label("Task3");
        tit.setStyle("-fx-font-size:20px;-fx-font-weight:bold");
        TextField R1 = new TextField();
        Button calck = new Button("найти");
        Label res1 = new Label("A1");
        Label res2 = new Label("A2");
        Label res3 = new Label("A3");
        Label res4 = new Label("A4");
        Label res5 = new Label("A5");
        calck.setOnAction(www -> {
            int A = Integer.parseInt(R1.getText());
            res1.setText(String.valueOf(pow(A,2)));
            res2.setText(String.valueOf(pow(A,3)));
            res3.setText(String.valueOf(pow(A,5)));
            res4.setText(String.valueOf(pow(A,10)));
            res5.setText(String.valueOf(pow(A,15)));
            });
            Button z1 = new Button("1");
            Button z2 = new Button("2");
            Button z3 = new Button("3");
            Button z4 = new Button("4");
            z1.setOnAction(event -> Pereh.setScene(scenet1));
            z2.setOnAction(event -> Pereh.setScene(scenet2));
            z3.setOnAction(event -> Pereh.setScene(scenet3));
            z4.setOnAction(event -> Pereh.setScene(scenet4));
            HBox knopper = new HBox(10, z1, z2, z3, z4);
            knopper.setAlignment(Pos.CENTER);
            HBox vvod = new HBox(10, new Label("A="), R1);
            vvod.setAlignment(Pos.CENTER);
            HBox res = new HBox(10, new Label("A^2="), res1, new Label("A^3="), res2, new Label("A^5="), res3, new Label("A^10="), res4, new Label("A^15="), res5);
            res.setAlignment(Pos.CENTER);
            VBox ob = new VBox(20, tit, vvod, calck, res, knopper);
            ob.setAlignment(Pos.CENTER);
            ob.setPadding(new Insets(20));
            return new Scene(ob, 1000, 500);
        }
    private Scene createScene4() {
        Label tit = new Label("Task4");
        tit.setStyle("-fx-font-size:20px;-fx-font-weight:bold");
        TextField R1 = new TextField();
        Button calck = new Button("найти");
        Label res1 = new Label("ответ");
        calck.setOnAction(www -> {
            int a = Integer.parseInt(R1.getText());
            double x=pow(10,-1*a+cos(a+1));
            double y = log(abs(atan(x)-sin(a*x)));
            res1.setText(String.valueOf(y));
        });
        Button z1 = new Button("1");
        Button z2 = new Button("2");
        Button z3 = new Button("3");
        Button z4 = new Button("4");
        z1.setOnAction(event -> Pereh.setScene(scenet1));
        z2.setOnAction(event -> Pereh.setScene(scenet2));
        z3.setOnAction(event -> Pereh.setScene(scenet3));
        z4.setOnAction(event -> Pereh.setScene(scenet4));
        HBox knopper = new HBox(10, z1, z2, z3, z4);
        knopper.setAlignment(Pos.CENTER);
        HBox vvod = new HBox(10, new Label("A="), R1);
        vvod.setAlignment(Pos.CENTER);
        HBox res = new HBox(10, new Label("Y="), res1);
        res.setAlignment(Pos.CENTER);
        VBox ob = new VBox(20, tit, vvod, calck, res, knopper);
        ob.setAlignment(Pos.CENTER);
        ob.setPadding(new Insets(20));
        return new Scene(ob, 500, 500);
    }
        public static void main (String[]args){
            launch();
        }


    }