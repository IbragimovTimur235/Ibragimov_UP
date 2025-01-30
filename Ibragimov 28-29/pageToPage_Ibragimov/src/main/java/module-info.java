module ru.ibragimov.pagetopage_ibragimov {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ibragimov.pagetopage_ibragimov to javafx.fxml;
    exports ru.ibragimov.pagetopage_ibragimov;
    exports ru.ibragimov.pagetopage_ibragimov.controller;
    opens ru.ibragimov.pagetopage_ibragimov.controller to javafx.fxml;
}