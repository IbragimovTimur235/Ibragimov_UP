module ru.ibragimov.ibragimov_task1_289 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ibragimov.ibragimov_task1_289 to javafx.fxml;
    exports ru.ibragimov.ibragimov_task1_289;
    exports ru.ibragimov.ibragimov_task1_289.controller;
    opens ru.ibragimov.ibragimov_task1_289.controller to javafx.fxml;
}