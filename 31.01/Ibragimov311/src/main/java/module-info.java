module ru.ibragimov.ibragimov311 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ibragimov.ibragimov311 to javafx.fxml;
    exports ru.ibragimov.ibragimov311;
}