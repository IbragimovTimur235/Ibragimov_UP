package ru.ibragimov.ibragimov311;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static java.lang.Math.*;
import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scane1;
    private Scene scane2;
    private Scene scane3;


    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scane1 = createScene1();
        scane2 = createScene2();
        scane3 = createScene3();
        primaryStage.setTitle("Практическая работа 6");
        primaryStage.setScene(scane1);
        primaryStage.show();
    }

    private Scene createScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        Button calcButton = new Button("Найти периметр");
        Label resultLabel = new Label();

        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int s = 4/a;
                resultLabel.setText("периметр = " + s);
            } catch (ArithmeticException e) {
                resultLabel.setText("деление на 0" );
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
    private Scene createScene2(){
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField X1Field=  new TextField();
        TextField X2Field =  new TextField();
        Button calcButton = new Button("Выч");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double x1=Double.parseDouble(X1Field.getText());
                double x2=Double.parseDouble(X2Field.getText());
                double r=abs(x2-x1);
                resultLabel.setText("Растояние:"+r);
            }catch (ArithmeticException e){
                resultLabel.setText("Ошибка");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));

        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x1="),X1Field , new Label("x2="), X2Field);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        return new Scene(root, 500, 500);
    }
    public static void main(String[] args){launch();}
    private  Scene createScene3(){
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideTFField = new TextField();
        TextField sideV1Field = new TextField();
        TextField sideV2Field = new TextField();
        TextField sideSField = new TextField();
        Button calcButton = new Button("Найти");
        Label resultLabel = new Label();

        calcButton.setOnAction(event -> {
            try {
                double T=Double.parseDouble(sideTFField.getText());
                double V1=Double.parseDouble(sideV1Field.getText());
                double V2=Double.parseDouble(sideV2Field.getText());
                double S=Double.parseDouble(sideSField.getText());
                double S2=abs(S-T*(V1-V2));
                resultLabel.setText("Путь:" +S2);
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка " );
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scane1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scane2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scane3));

        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("T="), sideTFField, new Label("V1="), sideV1Field);
        root1.setAlignment(Pos.CENTER);
        HBox root3 = new HBox(10, new Label("V2="), sideV2Field, new Label("S="), sideSField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, root3, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);


    }
}