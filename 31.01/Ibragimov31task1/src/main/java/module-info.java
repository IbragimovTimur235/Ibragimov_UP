module ru.ibragimov.ibragimov31task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ibragimov.ibragimov31task1 to javafx.fxml;
    exports ru.ibragimov.ibragimov31task1;
}